package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

@Getter
@Setter
//@Entity
//@Table(name = "")
public class Exercicio
{
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="")
    private Integer id;

    //@Column(name="")
    private String enunciado;

    //@Column(name="")
    private Integer coins;

    //@Column(name="")
    private String linkMidia;

    //@Column(name="", columnDefinition="bit(1)")
    private Boolean rascunho;
}
