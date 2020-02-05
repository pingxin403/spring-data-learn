package com.hyp.learn.es.dao;

import com.hyp.learn.es.domain.Article;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
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
public interface ArticleDao extends ElasticsearchRepository<Article, Integer> {

    //根据标题查询
    List<Article> findByTitle(String title);

    //根据标题或内容查询
    List<Article> findByTitleOrContext(String title, String context);

    //根据标题或内容查询(含分页)
    List<Article> findByTitleOrContext(String title, String context, Pageable pageable);


}
