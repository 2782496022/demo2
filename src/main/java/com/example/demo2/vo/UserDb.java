package com.example.demo2.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Data//该注解是lombok的注解自动生成get and set

@Entity  // 该注解声明一个实体类，与数据库中的表对应
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class UserDb implements Serializable {
    @Id   // 表明id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // 自增长策略
    private Long sid;

    private String customer_name;
    private String name;
    private String age;
    private String sex;





}
