package com.hyp.learn.ca;

import com.hyp.learn.ca.domain.Article;
import com.hyp.learn.ca.es.EsArticle;
import com.hyp.learn.ca.mongo.Comment;
import com.hyp.learn.ca.service.ArticleService;
import com.hyp.learn.ca.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.ca
 * hyp create at 20-2-4
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ViewTest {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    //最新文章列表
    @Test
    public void testFindNewArticleList() {
        List<Article> list = articleService.findNewArticleList();
        for (Article article : list) {
            System.out.println(article);
        }
    }

    //根据文章获取评论
    @Test
    public void testFindCommentsByAid() {
        List<Comment> comments = commentService.findCommentsByAid(3);
        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }


    //文章全文检索
    @Test
    public void testSearch() {
        List<EsArticle> esArticles = articleService.search(0, 10, "程序员");
        for (EsArticle esArticle : esArticles) {
            System.out.println(esArticle);
        }
    }



}
