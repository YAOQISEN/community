package com.guison.community.community.mapper;


import com.guison.community.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}
