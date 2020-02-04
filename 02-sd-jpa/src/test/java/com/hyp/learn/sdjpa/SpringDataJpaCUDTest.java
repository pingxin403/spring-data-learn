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
@ContextConfiguration("classpath:applicationContext-jpa.xml")
public class SpringDataJpaCUDTest {

    @Autowired
    private ArticleDao articleDao;

    //保存
    @Test
    public void testSave() {
        Article article = new Article();
        article.setTitle("平心1");
        article.setAuthor("平心1");
        article.setCreateTime(new Date());

        //保存一个实体
        articleDao.save(article);

        //保存一个实体,并且立即刷新缓存
        //articleDao.saveAndFlush(article);
    }

    //保存多个
    @Test
    public void testSaveAll() {
        Article article1 = new Article();
        article1.setTitle("平心1");
        article1.setAuthor("平心1");
        article1.setCreateTime(new Date());

        Article article2 = new Article();
        article2.setTitle("平心2");
        article2.setAuthor("平心1");
        article2.setCreateTime(new Date());

        Article article3 = new Article();
        article3.setTitle("平心3");
        article3.setAuthor("平心1");
        article3.setCreateTime(new Date());

        List list = new ArrayList();
        list.add(article1);
        list.add(article2);
        list.add(article3);

        //保存多个实体
        articleDao.saveAll(list);
    }


    //删除
    @Test
    public void testDeleteOne() {

        //1  根据主键删除
        //articleDao.deleteById(13);

        //2 根据实体删除,但是这个实体必须要有主键
        Article article = new Article();
        article.setAid(13);

        articleDao.delete(article);
    }


    //删除
    @Test
    public void testDeleteAll() {
        //1 删除所有  先查询--再一条条的删除
        //articleDao.deleteAll();

        //2 删除所有  一下子删除所有记录
        //articleDao.deleteAllInBatch();

        Article article1 = new Article();
        article1.setAid(24);

        Article article2 = new Article();
        article2.setAid(22);

        List list = new ArrayList();
        list.add(article1);
        list.add(article2);

        //3 批量删除指定数据  一条语句搞定
        //articleDao.deleteInBatch(list);

        //4 先一条条的查,然后再一条条的删除
        articleDao.deleteAll(list);
    }
}
