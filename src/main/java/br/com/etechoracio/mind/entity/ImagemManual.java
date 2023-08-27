package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

@Getter
@Setter
@Entity
@Table(name = "")
public class ImagemManual
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="")
    private String link;
    @Column(name="")
    private  int imagem;
    @JoinColumn(name="")
    @ManyToOne
    private CapituloManual capituloManual;

}
