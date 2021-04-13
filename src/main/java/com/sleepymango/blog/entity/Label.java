package com.sleepymango.blog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Description
 * @Author sleepymango
 * @Date 2021-03-31 01:10:33
 */

@Entity
@Data
@Table(name = "label")
public class Label implements Serializable {

    private static final long serialVersionUID = 5994973623776930980L;

    /**
     * 标签ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "label_id")
    private Long id;

    /**
     * 标签名
     */
    @Column(name = "label_name")
    private String name;

    /**
     * 标签别名
     */
    @Column(name = "label_alias")
    private String alias;

//    @JsonIgnoreProperties(value = "labels")
    @JsonIgnore
    @ManyToMany(mappedBy = "labels")
    private List<Article> articles;
}
