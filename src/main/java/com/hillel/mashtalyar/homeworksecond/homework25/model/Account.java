package com.hillel.mashtalyar.homeworksecond.homework25.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
@Getter
@Setter
public class Account {
    @Id
    private int id;
    @Column(name="client_id")
    private int clientId;
    private String number;
    private double value;
}
