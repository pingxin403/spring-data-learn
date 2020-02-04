package com.hyp.learn.redis;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.jpa
 * hyp create at 20-2-4
 **/
@Data
public class Article implements Serializable {

    private Integer aid;
    //声明类的属性跟数据表字段的对应关系,如果属性名称和字段名称一致,可省略
    private String title;
    private String author;
    private Date createTime;
}
