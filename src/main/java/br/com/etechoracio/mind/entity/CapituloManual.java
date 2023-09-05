package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
//@Table(name="")
public class CapituloManual {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="")
    private Integer id;

    //@Column(name="")
    private String nome;

    //@Column(name="")
    private String texto;
}
