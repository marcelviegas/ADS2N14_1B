package com.senac.model;

public class investimento extends Conta {
	// public int dataCriacao;
	private int dataCriacao;

	public void SetData(int data)
	{
this.dataCriacao = data;
		
		
	}

	public void dividendos(double taxa)
	{
		double valor = getSaldo()+(getSaldo()*taxa);
		
		setSaldo(valor);
	}

	public int getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	
}
