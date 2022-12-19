package com.hillel.mashtalyar.homeworksecond.homework24.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Client {
    private int id;
    private String name;
    private String email;
    private int phone;
    private String about;
    private int age;
    private String alias;

}
