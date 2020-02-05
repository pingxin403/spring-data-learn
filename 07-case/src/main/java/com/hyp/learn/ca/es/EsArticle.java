package com.hyp.learn.ca.es;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.ca.es
 * hyp create at 20-2-4
 **/
@Document(indexName = "case", type = "article")
public class EsArticle {

    @Id
    @Field(type = FieldType.Integer)
    private Integer id;//主键标识

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart", store = true)
    private String title;//标题

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart", store = true)
    private String content;//内容

    @Field(type = FieldType.Text)
    private String author;//作者

    @Field(type = FieldType.Date)
    private Date createTime;//创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "EsArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
