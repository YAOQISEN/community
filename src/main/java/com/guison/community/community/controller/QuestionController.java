package com.guison.community.community.controller;

import com.guison.community.community.dto.QuestionDTO;
import com.guison.community.community.mapper.QuestionMapper;
import com.guison.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 问题详情页的controller
 */
@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;


    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id")Long id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);

        //累加阅读数
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}
