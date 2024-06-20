package com.xq.dao;

import com.xq.entity.CommentsInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsDao {
    //查询评论
    CommentsInfo selectComments(CommentsInfo user_id, CommentsInfo problem_id);
    //添加评论
    CommentsInfo addComments(CommentsInfo content, CommentsInfo user_id, CommentsInfo problem_id);
    //修改评论
    CommentsInfo updateComments(CommentsInfo content, CommentsInfo user_id, CommentsInfo problem_id);
}
