package br.com.rafaelporreca.doacaobackend.Controllers;

import br.com.rafaelporreca.doacaobackend.dto.EstadoDTO;
import br.com.rafaelporreca.doacaobackend.entities.Estado;
import br.com.rafaelporreca.doacaobackend.servicies.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService service;

    @GetMapping
    public ResponseEntity<List<EstadoDTO>> findAll(){
        List<EstadoDTO> listDto = service.findAll();
        return ResponseEntity.ok().body(listDto);
    }
}
