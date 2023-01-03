package com.hillel.mashtalyar.homeworksecond.homework26.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    @Column(name = "phone")
    private int phone;
    private String about;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wallet_id", unique = true, nullable = false)
    private Wallet wallet;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Homework> homeworks;

    @ManyToMany
    @JoinTable(
            name = "client_lesson",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "lesson_id")})
    private Set<Lesson> lessons;
}
