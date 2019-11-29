package com.guison.community.community.controller;

import com.guison.community.community.dto.PaginationDTO;
import com.guison.community.community.dto.QuestionDTO;
import com.guison.community.community.mapper.QuestionMapper;
import com.guison.community.community.mapper.UserMapper;
import com.guison.community.community.model.Question;
import com.guison.community.community.model.User;
import com.guison.community.community.service.QuestionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page",defaultValue = "1")Integer page,
                        @RequestParam(name = "size",defaultValue = "5")Integer size,
                        @RequestParam(name = "search",required = false)String search
    ){
        PaginationDTO pagination = questionService.list(search,page,size);
        model.addAttribute("pagination",pagination);
        model.addAttribute("search",search);
        return "index";
    }
}
