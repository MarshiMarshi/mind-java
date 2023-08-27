package br.com.etechoracio.mind.entity;

import br.com.etechoracio.mind.entity.enums.TipoCosmetico;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="")
public class Cosmetico extends ItemLoja {

    @Column(name="")
    @Enumerated(value = EnumType.STRING)
    private TipoCosmetico tipoCosmetico;
}
