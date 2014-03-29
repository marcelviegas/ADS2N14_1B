package com.senac.model;

public class cliente {
	String nome;
    private int numconta = 1;
    int tConta;
    
    public void Cliente(String nome,int numconta,int tConta)
    {
    this.nome=nome;
    this.numconta=numconta;
    this.tConta=tConta;
    this.numconta++;
    }
    public int getnumconta()
    {
    	return this.numconta;
    }
    
}
