package com.hyp.learn.ca.domain;

import com.hyp.learn.ca.mongo.Comment;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa
 * hyp create at 20-2-4
 **/
@Data
@Entity//表示这是一个实体类
@Table(name = "article") //建立实体类和表的映射关系
public class Article implements Serializable {
    @Id//声明当前私有属性为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //配置主键的生成策略
    private Integer aid;
    //声明类的属性跟数据表字段的对应关系,如果属性名称和字段名称一致,可省略
    @Column(name = "title")
    private String title;
    private String author;
    private Date createTime;


    //1 声明类间关系
    //声明主动放弃关系维护 mappedBy="当前类在对方类中的属性名"
    //当保存Article的时候,同时保存ArticleData
    @OneToOne(mappedBy = "article", cascade = CascadeType.PERSIST)
    private ArticleData articleData;

    //2 在类中使用注解再声明表间关系
    // --书写注解
    // --明确谁来维护关系(在多的一方维护关系)
    //  ----在维护的一方主动声明维护策略,在不维护的一方声明主动放弃

}
