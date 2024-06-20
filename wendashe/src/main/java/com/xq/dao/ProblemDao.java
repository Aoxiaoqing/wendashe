package com.xq.dao;

import com.xq.entity.ProblemInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemDao {
    //添加问题
    ProblemInfo addProblem(ProblemInfo problem_content);
    //删除问题
    ProblemInfo deleteProblem(ProblemInfo problem_id);
    //修改问题
    ProblemInfo updateProblem(ProblemInfo problem_id, ProblemInfo problem_content);
    //查看问题
    ProblemInfo selectProblem(ProblemInfo problem_id);
}
