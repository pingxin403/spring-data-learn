package com.hyp.learn.ca.service;

import com.hyp.learn.ca.mongo.Comment;

import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.ca.service
 * hyp create at 20-2-4
 **/
public interface CommentService {

    //保存
    void saveComment(Comment comment);

    //删除
    void deleteByCid(String cid);

    //根据文章标识查询评论数据
    List<Comment> findCommentsByAid(Integer aid);
}
