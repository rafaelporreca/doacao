package br.com.rafaelporreca.doacaobackend.dto;

import br.com.rafaelporreca.doacaobackend.entities.Municipio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MunicipioDTO {

    private Long id;
    private String nome;

    public MunicipioDTO(Municipio obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }
}
