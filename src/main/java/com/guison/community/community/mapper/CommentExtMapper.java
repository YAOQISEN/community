package com.guison.community.community.mapper;


import com.guison.community.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}