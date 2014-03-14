package com.senac.jogos.apps.Matching.model;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.apps.Matching.controller.*;

public class MatchingCardGame {

	private Baralho baralho;
	private Jogador[] jogadores;
	private  JogoController contr;
	int posicao=0;
	private Carta mesa;
	
	public MatchingCardGame()
	{   
		baralho = new Baralho();
		for(int i=0;i<contr.getNunJogador();i++){
		jogadores[i] = new Jogador();
		mesa = baralho.drawCarta();
		}
	}
	
	public int matchCarta(Carta carta)
	{
		int score = -1;
		
		if (carta.getNaipe() == mesa.getNaipe())
			score = 1;
		if (carta.getValor() == mesa.getValor())
			score = 4;
		
		return score;
	}
	
	public void setMesa(Carta carta)
	{
		mesa = carta;
	}
	
	public Carta getMesa()
	{
		return mesa;
	}

	
	public Carta drawCarta()
	{
		return baralho.drawCarta();
	}
	
	public Jogador getJogador()
	{  posicao++;
		if(posicao>contr.getNunJogador())
		   posicao=1;
		return jogadores[posicao];
	      
	}
}












