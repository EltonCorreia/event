package br.gov.sp.etesp.event.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "tb_evento")

public class EventoEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String evento;
	private LocalDate dtEvento;
	private LocalDate dtCadastro;
	private String status;
	private LocalDate dtEncerramento;
	
	public LocalDate getDtEncerramento() {
		return dtEncerramento;
	}
	public void setDtEncerramento(LocalDate dtEncerramento) {
		this.dtEncerramento = dtEncerramento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEvento() {
		return evento;
	}
	public LocalDate getDtEvento() {
		return dtEvento;
	}
	public void setDtEvento(LocalDate dtEvento) {
		this.dtEvento = dtEvento;
	}
	public LocalDate getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}

	
}
