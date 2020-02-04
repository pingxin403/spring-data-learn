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
@Table(name = "comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    private String comment;


    @ManyToOne()
    @JoinColumn(name = "aid", referencedColumnName = "aid")
    private Article article;
}
