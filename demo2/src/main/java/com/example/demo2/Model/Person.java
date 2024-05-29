package com.example.demo2.Model;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private Integer sex;
    private boolean isMarried;
    private LocalDate createTime;
    private List<String> language;

    public Person() {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.isMarried = isMarried;
        this.createTime = createTime;
        this.language = language;
    }
    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Getter and Setter for sex
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    // Getter and Setter for isMarried
    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    // Getter and Setter for createTime
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    // Getter and Setter for language
    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }
}
