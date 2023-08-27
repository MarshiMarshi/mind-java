package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

@Getter
@Setter
@Entity
@Table(name = "")
public class Exercicio
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="")
    private String link;
    @Column(name="")
    private int coluna;
    @Column(name="")
    private int id;
    @Column(name="")
    private String enunciado;
    @Column(name="")
    private Byte rascunho;

}
