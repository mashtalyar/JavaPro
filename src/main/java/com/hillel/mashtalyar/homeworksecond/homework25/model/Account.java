package com.hillel.mashtalyar.homeworksecond.homework25.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="accounts")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="client_id")
    private int clientId;
    private String number;
    private double value;
}
