package com.hyp.learn.ca.es;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.ca.es
 * hyp create at 20-2-4
 **/
public interface EsArticleDao extends ElasticsearchRepository<EsArticle, Integer> {

    //根据title或者content进行查询
    List<EsArticle> findByTitleOrContent(String title, String content, Pageable pageable);

}
