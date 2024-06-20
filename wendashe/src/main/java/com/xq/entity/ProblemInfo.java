package com.xq.entity;

import lombok.Data;

@Data
public class ProblemInfo {
    private Integer problem_id;
    private Integer user_id;
    private String title;
    private String problem_content;
}
