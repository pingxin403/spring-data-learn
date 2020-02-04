package com.hyp.learn.sdjpa;

import com.hyp.learn.sdjpa.domain.Article;
import com.hyp.learn.sdjpa.domain.Comment;
import com.hyp.learn.sdjpa.jpa.ArticleDao;
import com.hyp.learn.sdjpa.jpa.CommentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa
 * hyp create at 20-2-4
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-jpa.xml")
public class One2ManyTest {

    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private CommentDao commentDao;

    //保存
    @Test
    public void testSave() {
        //创建文章对象
        Article article = new Article();
        article.setTitle("黑马好文章");
        article.setAuthor("黑马");
        article.setCreateTime(new Date());

        //创建文章评论对象
        Comment comment1 = new Comment();
        comment1.setComment("真不错");
        Comment comment2 = new Comment();
        comment2.setComment("挺好的");

        //建立两个对象间的关系
        comment1.setArticle(article);
        comment2.setArticle(article);

        Set<Comment> comments = new HashSet<>();
        comments.add(comment1);
        comments.add(comment2);
        article.setComments(comments);


        //保存操作
        articleDao.save(article);
        commentDao.save(comment1);
        commentDao.save(comment2);

    }
}
