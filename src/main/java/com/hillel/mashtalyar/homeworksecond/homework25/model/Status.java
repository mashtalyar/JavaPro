package com.hillel.mashtalyar.homeworksecond.homework25.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="statuses")
@Getter
@Setter
public class Status {
    @Id
    private int id;
    private String alias;
    private String description;

}
