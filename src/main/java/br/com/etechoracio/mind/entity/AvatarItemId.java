package br.com.etechoracio.mind.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
//@Embeddable
public class AvatarItemId implements Serializable {

    private Integer idUsuario;
    private Integer idItemLoja;
}
