package br.leg.antonia.api.repository;

import br.leg.antonia.api.model.Emenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmendaRepository extends JpaRepository<Emenda, Long> {
}