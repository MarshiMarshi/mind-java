package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="")
    private int id;

    @Column(name="")
    private String nome;

    @Column(name="")
    private String sobrenome;

    @Column(name="")
    private String email;

    @Column(name="")
    private String senha;

    @Column(name="")
    private LocalDate dataNascimento;

    @Column(name="")
    private int totalCoins;
}
