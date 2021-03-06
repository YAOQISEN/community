package com.guison.community.community.dto;

import com.guison.community.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer commentCount;
    private Long likeCount;
    private String content;
    private User user;
}
