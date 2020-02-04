package com.hyp.learn.sdjpa;

import com.hyp.learn.sdjpa.domain.Article;
import com.hyp.learn.sdjpa.jpa.ArticleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa
 * hyp create at 20-2-4
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-jpa.xml")
public class Query3Test {

    @Autowired
    private ArticleDao articleDao;


    @Test
    public void testFindByCondition1() {
        List<Article> articles = articleDao.findByCondition1("平心程序员1", "平心");
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByCondition2() {
        List<Article> articles = articleDao.findByCondition2("平心程序员1", "平心");
        for (Article article : articles) {
            System.out.println(article);
        }
    }


    @Test
    public void testFindByCondition4() {
        List<Article> articles = articleDao.findByCondition4("平心程序员");
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByCondition5() {
        Pageable pageable = PageRequest.of(0, 3);
        List<Article> articles = articleDao.findByCondition5(pageable, "平心程序员");
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByCondition6() {
        List<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(30);

        List<Article> articles = articleDao.findByCondition6(list);
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    public void testFindByCondition7() {
        Article articleParam = new Article();
        articleParam.setTitle("平心程序员1");
        articleParam.setAuthor("平心");
        List<Article> articles = articleDao.findByCondition7(articleParam);
        for (Article article : articles) {
            System.out.println(article);
        }
    }


    @Test
    public void testFindByCondition8() {
        List<Article> articles = articleDao.findByCondition8("平心程序员1", "平心");
        for (Article article : articles) {
            System.out.println(article);
        }
    }

}
