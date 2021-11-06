package br.com.rafaelporreca.doacaobackend.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_estado")
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "estado")
    private List<Municipio> municipios = new ArrayList<>();

    public Estado(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
