package com.hyp.learn.jpa;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.jpa
 * hyp create at 20-2-4
 **/
public class JpaTest {

    @Test
    public void testSave() {
        //1 创建持久化管理器工厂
        String persistenceUnitName = "springdata";
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(persistenceUnitName);

        //2 创建持久化管理器
        EntityManager entityManager = factory.createEntityManager();

        //3 获取事务
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        //4 操作
        Article article = new Article();
        article.setTitle("测试文章标题");
        article.setAuthor("px");
        article.setCreateTime(new Date());
        entityManager.persist(article);

        //5 事务提交
        transaction.commit();

        //6 关闭资源
        entityManager.close();
    }

    @Test
    public void testFindByAid() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdata");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Article article = entityManager.find(Article.class, 1);
        System.out.println(article);

        transaction.commit();
        entityManager.close();
    }

    @Test
    public void testUpdate() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdata");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Article article = entityManager.find(Article.class, 1);
        //修改
        article.setAuthor("平心");

        entityManager.merge(article);

        transaction.commit();
        entityManager.close();
    }

    @Test
    public void testDelete() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdata");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Article article = entityManager.find(Article.class, 1);
        //删除
        entityManager.remove(article);

        transaction.commit();
        entityManager.close();
    }
}
