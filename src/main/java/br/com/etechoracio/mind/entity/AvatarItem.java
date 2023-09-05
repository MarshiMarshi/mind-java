package br.com.etechoracio.mind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
//@Entity
//@Table(name="")
public class AvatarItem {

    //@EmbeddedId
    private AvatarItemId id = new AvatarItemId();

    //@ManyToOne
    //@MapsId
    //@JoinColumn(name="")
    private Usuario usuario;

    //@ManyToOne
    //@MapsId
    //@JoinColumn(name="")
    private ItemLoja itemLoja;

    //@Column(name="")
    private Boolean emUso;

    //@Column(name="")
    private LocalDate dataCompra;
}
