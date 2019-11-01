package com.neo.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Value("张三")
    private String name;

    @Value("#{20-2}")
    private Integer age;
    
    @Value("${person.area}")
    private String area;
}