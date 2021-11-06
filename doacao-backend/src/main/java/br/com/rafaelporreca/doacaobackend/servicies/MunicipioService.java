package br.com.rafaelporreca.doacaobackend.servicies;

import br.com.rafaelporreca.doacaobackend.dto.MunicipioDTO;
import br.com.rafaelporreca.doacaobackend.entities.Municipio;
import br.com.rafaelporreca.doacaobackend.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MunicipioService {

    @Autowired
    private MunicipioRepository repo;

    @Transactional(readOnly = true)
    public List<MunicipioDTO> findAll(){
        List<MunicipioDTO> listDto = new ArrayList<>();
        List<Municipio> list = repo.findAll();
        listDto = list.stream().map(obj -> new MunicipioDTO(obj)).collect(Collectors.toList());
        return listDto;
    }
}
