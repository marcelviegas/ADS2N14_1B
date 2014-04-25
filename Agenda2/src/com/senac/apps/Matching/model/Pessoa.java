package com.senac.apps.Matching.model;

import com.senac.agenda.*;

public class Pessoa {
    
	private String nome;
	private String endereco;
	private Telefone fone;
	

	public Pessoa(String nome, String endereco) {
		
		this.nome = nome;
		this.endereco = endereco;
		
	}
public Pessoa() {
		
		
		
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Telefone getFone() {
		return fone;
	}


	public void setFone(Telefone fone) {
		this.fone = fone;
	}

	
	


}
