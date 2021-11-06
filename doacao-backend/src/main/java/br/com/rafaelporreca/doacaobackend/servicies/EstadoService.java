package br.com.rafaelporreca.doacaobackend.servicies;

import br.com.rafaelporreca.doacaobackend.dto.EstadoDTO;
import br.com.rafaelporreca.doacaobackend.entities.Estado;
import br.com.rafaelporreca.doacaobackend.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repo;

    @Transactional(readOnly = true)
    public List<EstadoDTO> findAll(){
        List<EstadoDTO> listDto = new ArrayList<>();
        List<Estado> list = repo.findAll();
        listDto = list.stream().map(obj -> new EstadoDTO(obj)).collect(Collectors.toList());
        return listDto;
    }
}
