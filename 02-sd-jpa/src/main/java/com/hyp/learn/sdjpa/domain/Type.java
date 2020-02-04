package com.hyp.learn.sdjpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa.domain
 * hyp create at 20-2-4
 **/
@Data
@Entity
@Table(name = "type")
public class Type implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tid;

    private String name;

    @ManyToMany
    @JoinTable(
            //代表中间表名称
            name = "article_type",
            //中间表的外键对应到当前表的主键名称
            joinColumns = {@JoinColumn(name = "tid", referencedColumnName = "tid")},
            //中间表的外键对应到对方表的主键名称
            inverseJoinColumns = {@JoinColumn(name = "aid", referencedColumnName = "aid")}
    )
    private Set<Article> articles = new HashSet<>(0);
}
