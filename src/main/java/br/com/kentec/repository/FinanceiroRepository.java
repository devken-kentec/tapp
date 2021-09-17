package br.com.kentec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Financeiro;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long> {

}
