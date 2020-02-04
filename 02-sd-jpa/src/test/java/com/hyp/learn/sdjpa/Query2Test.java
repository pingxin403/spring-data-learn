package com.hyp.learn.sdjpa;

import com.hyp.learn.sdjpa.domain.Article;
import com.hyp.learn.sdjpa.jpa.ArticleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa
 * hyp create at 20-2-4
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Query2Test {


    @Autowired
    private ArticleDao articleDao;

    @Test
    public void testFindByTitle() {
        List<Article> articles = articleDao.findByTitle("平心1");
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByTitleLike() {
        List<Article> articles = articleDao.findByTitleLike("%平心%");
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByTitleAndAuthor() {
        List<Article> articles = articleDao.findByTitleAndAuthor("平心1", "平心");
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByAidIsLessThan() {
        List<Article> articles = articleDao.findByAidIsLessThan(25);
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByAidBetween() {
        List<Article> articles = articleDao.findByAidBetween(25, 30);
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByAidIn() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(30);
        List<Article> articles = articleDao.findByAidIn(list);
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByCreateTimeAfter() {
        List<Article> articles = articleDao.findByCreateTimeAfter(new Date());
        for (Article article : articles) {
            System.out.println(article);
        }
    }


}
