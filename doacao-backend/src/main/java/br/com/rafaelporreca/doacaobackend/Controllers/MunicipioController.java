package br.com.rafaelporreca.doacaobackend.Controllers;

import br.com.rafaelporreca.doacaobackend.dto.MunicipioDTO;
import br.com.rafaelporreca.doacaobackend.servicies.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {

    @Autowired
    private MunicipioService service;

    @GetMapping
    public ResponseEntity<List<MunicipioDTO>> findAll(){
        List<MunicipioDTO> listDto = service.findAll();
        return ResponseEntity.ok().body(listDto);
    }
}
