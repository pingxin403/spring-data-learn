package com.hyp.learn.ca.jpa;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa
 * hyp create at 20-2-4
 **/

import com.hyp.learn.ca.domain.Article;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * JpaRepository<实体类类型,主键类型>:用来完成基本 CRUD 操作
 * JpaSpecificationExecutor<实体类类型>:用于复杂查询(分页等查询操作)
 */
@Repository
public interface ArticleDao extends JpaRepository<Article, Integer>,
        JpaSpecificationExecutor<Article> {


}
