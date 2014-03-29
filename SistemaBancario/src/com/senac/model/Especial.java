package com.senac.model;

public class Especial extends Conta {
private double limite=0;


public void setLimete(double limite)
{
	this.limite=this.limite-limite;
}
	
public void Saque(double valor)
{
	if((getSaldo()-valor<this.limite))
			{
		          
		System.out.println("saldo insufiente para realizar saque");
		
			}
	else
	{
		
		double valor2 = getSaldo()-valor;
		setSaldo(valor2);
		System.out.println("Saque efetuado com sucesso");
	}
	
}



}
