package com.guison.community.community.controller;

import com.guison.community.community.dto.AccessTokenDTO;
import com.guison.community.community.dto.GithubUser;
import com.guison.community.community.mapper.UserMapper;
import com.guison.community.community.model.User;
import com.guison.community.community.provider.GithubProvider;
import com.guison.community.community.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller
@Slf4j
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @Value("${github.client.id}")
    String clientId;

    @Value("${github.client.secret}")
    String clientSecret;

    @Value("${github.redirect.uri}")
    String redirectUri;

    @Autowired
    private UserService userService;

    @GetMapping("/callback")
    public String callBack(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletRequest request,
                           HttpServletResponse response){
        AccessTokenDTO accessTokenDTO  = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser githubUser = githubProvider.getUser(accessToken);
        if(githubUser!=null && githubUser.getId()!=null){
            User user = new User();
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setName(githubUser.getLogin());
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            user.setBio(githubUser.getBio());
            user.setAvatarUrl(githubUser.getAvatarUrl());
            //修复登录功能，之前只要查到cookie中有token就往数据库存新的用户；要添加判断，数据库中没有这个accountId才创建，不然就是修改；
            userService.createOrUpdate(user);
            response.addCookie(new Cookie("token",token));
            return "redirect:/";
        }else{
            log.error("callback get github error,{}",githubUser);
            //登录失败，重新登录
            return "redirect:/";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request,
                         HttpServletResponse response){
        request.getSession().removeAttribute("user");
        Cookie cookie = new Cookie("token",null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/";
    }
}
