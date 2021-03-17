package br.sp.gov.curso.dto;

import java.io.Serializable;

public class CursoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String sigla;
	
	public CursoDto() {
	}
	
	public CursoDto(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	
}
