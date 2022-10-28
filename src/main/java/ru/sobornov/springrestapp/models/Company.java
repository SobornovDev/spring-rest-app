package ru.sobornov.springrestapp.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author : Sobornov Vladimir
 * @since : 28.10.2022
 **/

@Entity
@Table(name = "Company")
@EqualsAndHashCode
@Getter
@Setter
public class Company {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "size")
    private int size;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "created_whom")
    private String createdWhom;

    public Company(String name, String email, int size) {
        this.name = name;
        this.email = email;
        this.size = size;
    }

    public Company() {}
}
