package com.da2win.springcloudlesson6.domain;

import java.io.Serializable;

/**
 *
 * 用户模型
 * @Author Darwin
 * @Date 2018/12/5 15:47
 */
public class User implements Serializable {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
