package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="")
public class ItemLoja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="")
    private int id;

    @Column(name="")
    private int preco;

    @Column(name="")
    private String LinkImagem;
}
