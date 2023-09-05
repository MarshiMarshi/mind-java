package br.com.etechoracio.mind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
//@Table(name="")
public class Tema extends ItemLoja {

    //@Column(name="")
    private String cor;
}
