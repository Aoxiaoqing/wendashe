package com.xq.entity;

import lombok.Data;

@Data
public class CommentsInfo {
    private Integer comments_id;
    private Integer user_id;
    private Integer problem_id;
    private String time;
    private String content;
}
