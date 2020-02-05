package com.hyp.learn.ca.service.impl;

import com.hyp.learn.ca.mongo.Comment;
import com.hyp.learn.ca.mongo.CommentDao;
import com.hyp.learn.ca.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.ca.service.impl
 * hyp create at 20-2-4
 **/
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public void saveComment(Comment comment) {
        commentDao.save(comment);
    }

    @Override
    public void deleteByCid(String cid) {
        commentDao.deleteById(cid);
    }

    @Override
    public List<Comment> findCommentsByAid(Integer aid) {
        return commentDao.findByAid(aid);
    }


}
