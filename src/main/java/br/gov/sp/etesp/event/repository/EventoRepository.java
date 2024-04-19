package br.gov.sp.etesp.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etesp.event.model.EventoEntities;
@Repository
public interface EventoRepository extends JpaRepository<EventoEntities, Long>{

}
