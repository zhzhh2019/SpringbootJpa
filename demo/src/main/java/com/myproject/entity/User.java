package com.myproject.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "User")
public class User implements Serializable {//序列化在Jpa需要

    private static final long serialVersionUID = 1L;
    @Id //主键
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",nullable = false,unique = true)
    private String name;

    @Column(name = "password",nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
