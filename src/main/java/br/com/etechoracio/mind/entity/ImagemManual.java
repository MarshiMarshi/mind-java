package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

@Getter
@Setter
//@Entity
//@Table(name = "")
public class ImagemManual
{
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="")
    private Integer id;

    //@Column(name="")
    private String link;

    //@ManyToOne
    //@JoinColumn(name="")
    private CapituloManual capituloManual;

}
