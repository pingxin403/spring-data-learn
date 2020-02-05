package com.hyp.learn.ca.service;

import com.hyp.learn.ca.domain.Article;
import com.hyp.learn.ca.es.EsArticle;

import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.ca.service
 * hyp create at 20-2-4
 **/
public interface ArticleService {

    //保存文章
    void saveArticle(Article article);


    //更新文章
    void updateArticle(Article article);


    //删除文章
    void deleteByAid(Integer aid);


    //最新文章列表
    List<Article> findNewArticleList();


    //文章检索
    List<EsArticle> search(Integer pageNum, Integer pageSize, String keyword);
}
