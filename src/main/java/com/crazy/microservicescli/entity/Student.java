package com.crazy.microservicescli.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @ClassName Student
 * @Description TODO
 * @Author ASUS
 * @Date 2024/6/6 17:53
 * @Version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true,value = "hibernateLazyInitializer")
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer age;





}
