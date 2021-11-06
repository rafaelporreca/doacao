package br.com.rafaelporreca.doacaobackend.repositories;

import br.com.rafaelporreca.doacaobackend.entities.Estado;
import br.com.rafaelporreca.doacaobackend.entities.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Long> {
}
