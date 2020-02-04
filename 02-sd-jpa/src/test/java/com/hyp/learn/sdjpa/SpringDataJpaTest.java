package com.hyp.learn.sdjpa;

import com.hyp.learn.sdjpa.domain.Article;
import com.hyp.learn.sdjpa.jpa.ArticleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa
 * hyp create at 20-2-4
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-jpa.xml")
public class SpringDataJpaTest {

    @Autowired
    private ArticleDao articleDao;

    //保存
    @Test
    public void testSave() {
        Article article = new Article();
        article.setTitle("平心1的个人自述");
        article.setAuthor("平心2");
        article.setCreateTime(new Date());

        articleDao.save(article);
    }


    //查询主键
    @Test
    public void testFindByAid() {
        Optional<Article> optional = articleDao.findById(1);
        System.out.println(optional.get());
    }

    //查询所有
    @Test
    public void testFindAll() {
        List<Article> articles = articleDao.findAll();
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    //修改
    @Test
    public void testUpdate() {
        Article article = new Article();
        article.setAuthor("黑马3");
        article.setAid(2);

        //Spingdata Jpa的保存和修改使用的都是save方法
        //关键来看传入的实体是否有主键
        //---如果有主键,代表要修改
        //---如果没有主键,代表要保存
        articleDao.save(article);
    }

    //删除
    @Test
    public void testDelete() {
        articleDao.deleteById(2);
    }
}
