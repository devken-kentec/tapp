package br.com.kentec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Aprender;

@Repository
public interface AprenderRepository extends JpaRepository<Aprender, Long> {

}
