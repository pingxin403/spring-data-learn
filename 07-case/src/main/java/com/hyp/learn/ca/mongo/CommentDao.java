package com.hyp.learn.ca.mongo;


import com.hyp.learn.ca.mongo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa.jpa
 * hyp create at 20-2-4
 **/
public interface CommentDao extends MongoRepository<Comment, String> {

    //命名规则查询:按照aid查询到一个文章的所有评论
    List<Comment> findByAid(Integer aid);
}
