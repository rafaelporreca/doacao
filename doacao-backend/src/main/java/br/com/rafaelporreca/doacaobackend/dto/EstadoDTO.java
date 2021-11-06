package br.com.rafaelporreca.doacaobackend.dto;

import br.com.rafaelporreca.doacaobackend.entities.Estado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EstadoDTO {

    private Long id;
    private String nome;
    private List<MunicipioDTO> municipios;

    public EstadoDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public EstadoDTO(Estado obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.municipios = obj.getMunicipios().stream().map(m -> new MunicipioDTO(m)).collect(Collectors.toList());
    }
}
