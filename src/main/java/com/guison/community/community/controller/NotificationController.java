package com.guison.community.community.controller;

import com.guison.community.community.dto.CommentDTO;
import com.guison.community.community.dto.NotificationDTO;
import com.guison.community.community.dto.QuestionDTO;
import com.guison.community.community.enums.CommentTypeEnum;
import com.guison.community.community.enums.NotificationTypeEnum;
import com.guison.community.community.model.User;
import com.guison.community.community.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;


@Controller
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String question(HttpServletRequest request,
                           @PathVariable(name = "id")Long id){

        User user = (User)request.getSession().getAttribute("user");
        if(user == null){
            return "redirect:/";
        }

        NotificationDTO notificationDTO =  notificationService.read(id,user);

        if(NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType() ||
                NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType() ){
            return "redirect:/question/" + notificationDTO.getOuterId();
        }
        else{
            return "redirect:/";
        }
    }


}
