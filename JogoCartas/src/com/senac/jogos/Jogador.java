package com.senac.jogos;

public class Jogador {

	private int pontos;
	int online;
	public Jogador() {
		this.pontos = 0;
		
	}

	public int getPontos() {
		return pontos;
	}

	public void addPontos(int amount) {
		pontos += amount;
	}

	public void subtractPontos(int amount) {
		pontos -= amount;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

    public void setonline()
    {
    	this.online =1;
    }
    public int getonline()
    {
    	return online; 
    }
}
