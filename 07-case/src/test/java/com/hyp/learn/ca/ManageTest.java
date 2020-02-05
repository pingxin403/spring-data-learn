package com.hyp.learn.ca;

import com.hyp.learn.ca.domain.Article;
import com.hyp.learn.ca.domain.ArticleData;
import com.hyp.learn.ca.mongo.Comment;
import com.hyp.learn.ca.service.ArticleService;
import com.hyp.learn.ca.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.ca
 * hyp create at 20-2-4
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ManageTest {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    //保存文章
    @Test
    public void testSaveArticle() {

        //准备测试数据
        ArticleData articleData = new ArticleData();
        articleData.setContent("4平心专注于IT培训,Java培训,人工智能培训,Python培训,大数据培训,区\n" +
                "块链培训,UI设计培训,PHP培训,Web前端培训,软件测试培训,产品经理培训，并提供Java培训,大数据培训,区块链培训,UI\n" +
                "设计培训,PHP培训,软件测试培训,产品经理培训等服务。");


        Article article = new Article();
        article.setTitle("4平心介绍");
        article.setAuthor("4平心");
        article.setCreateTime(new Date());

        //建立两者关系
        article.setArticleData(articleData);
        articleData.setArticle(article);

        articleService.saveArticle(article);
    }

    //更新文章
    @Test
    public void testUpdateArticle() {

        //准备测试数据
        ArticleData articleData = new ArticleData();
        articleData.setContent("马云，男，汉族，中共党员，1964年9月10日生于浙江省杭州市，祖籍浙江省嵊州市谷来镇， 阿里巴巴集团主要创始人，现担任日本软银董事、大自然保护协会中国理事会主席兼全球董事会成员、华谊兄弟董事、生命科学突破奖基金会董事、联合国数字合作高级别小组联合主席。");

        Article article = new Article();
        article.setAid(1);
        article.setTitle("1平心介绍");
        article.setAuthor("1平心");
        article.setCreateTime(new Date());
        article.setArticleData(articleData);

        articleService.updateArticle(article);
    }


    //删除文章
    @Test
    public void testDeleteArticle() {
        articleService.deleteByAid(2);
    }

    //添加评论
    @Test
    public void testSaveComment(){

        Comment comment = new Comment();
        comment.setCid(UUID.randomUUID().toString());
        comment.setAid(3);
        comment.setComment("2平心真棒!!!");
        comment.setNickname("2平心");
        commentService.saveComment(comment);
    }

    //删除评论
    @Test
    public void testDeleteComment(){
        commentService.deleteByCid("9c10f644-3301-4db1-b678-09539c1d5423");
    }
}
