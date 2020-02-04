package com.hyp.learn.jpa;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.jpa
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
}
