package br.com.rafaelporreca.doacaobackend.repositories;

import br.com.rafaelporreca.doacaobackend.entities.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio,Long> {
}
