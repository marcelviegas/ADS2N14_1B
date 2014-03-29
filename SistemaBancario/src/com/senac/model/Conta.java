package com.senac.model;
//classes model implementada.(commit atrasado)
public class Conta {
	
	private double saldo;
	private int numConta;
	private int numVerificacao;
	
	
	public Conta()

	{
		
	}

    public void Depositar(int valor)
    {
    	this.saldo=this.saldo+valor;
    }

	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}



	public int getNumVerificacao() {
		return numVerificacao;
	}



	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}
	
	public void Saque(double valor)
	{
		if((saldo-valor<0))
				{
			          
			System.out.println("saldo insufiente para realizar saque");
			
				}
		else
		{
			this.saldo=this.saldo-valor;
			System.out.println("Saque efetuado com sucesso");
		}
		
	}
	
	

}
