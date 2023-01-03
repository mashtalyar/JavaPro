package com.hillel.mashtalyar.homeworksecond.homework26.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "wallets")
@Getter
@Setter

public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double amount;

    @OneToOne(mappedBy = "wallet")
    private Client client;
}
