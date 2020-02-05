package com.hyp.learn.mongo.dao;


import com.hyp.learn.mongo.domain.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.dao
 * hyp create at 20-2-4
 **/
@Repository
//自定义的接口需要继承ElasticsearchRepository<实体类型,主键类型>  基本的crud 分页
public interface ArticleDao extends MongoRepository<Article, Integer> {

    //根据标题查询
    List<Article> findByNameLike(String name);

    //根据点击量查询
    List<Article> findByHitsGreaterThan(Integer hits);


}
