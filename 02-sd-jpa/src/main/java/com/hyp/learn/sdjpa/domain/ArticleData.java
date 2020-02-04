package com.hyp.learn.sdjpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa.domain
 * hyp create at 20-2-4
 **/
@Data
@Entity
@Table(name = "article_data")
public class ArticleData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;


    //让这个实体维护关系
    //name                    当前表中的外键名
    //referencedColumnName    指向的对方表中的主键名
    @OneToOne
    @JoinColumn(name = "articleId", referencedColumnName = "aid", unique = true)
    private Article article;
}
