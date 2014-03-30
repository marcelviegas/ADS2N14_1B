package com.senac.model;

public class cliente {
	String nome;
	
	int tConta;

	public cliente(String texto, int valor) {
		this.nome = texto;

		this.tConta = valor;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int gettConta() {
		return tConta;
	}

	public void settConta(int tConta) {
		this.tConta = tConta;
	}



}
