package com.hyp.learn.sdjpa.jpa;

import com.hyp.learn.sdjpa.domain.ArticleData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa.jpa
 * hyp create at 20-2-4
 **/
public interface ArticleDataDao extends JpaRepository<ArticleData,Integer> {
}
