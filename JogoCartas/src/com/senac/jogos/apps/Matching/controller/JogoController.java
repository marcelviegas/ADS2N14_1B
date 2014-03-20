package com.senac.jogos.apps.Matching.controller;

import java.util.Scanner;
import com.senac.jogos.apps.Matching.model.MatchingCardGame;
import com.senac.jogos.cartas.Carta;

public class JogoController {
	private static Scanner teclado = new Scanner(System.in);
	private static MatchingCardGame jogo = new MatchingCardGame();
	private Carta cartaJogador;
	int nunj,v;
	int valor;
	int pular1, pular2, pular3, pular4;
	String verificarvalores;

	public JogoController() {

		cartaJogador = null;
	}

	public void playTurno() {
		int pontos = jogo.matchCarta(cartaJogador);
		jogo.getJogador().addPontos(pontos);
		// descartar carta
		jogo.setMesa(jogo.drawCarta());
		cartaJogador = null;
	}

	public  int verificarpulo(int valor) {
		
		if(valor==1)
		{
			return pular1;
		}
		if(valor==2)
		{
			return pular2;
		}
		if(valor==3)
		{
			return pular3;
		}        
		
		else
		{
			return pular4;
		}
		
	}
	
	public void pular(int val){
		if(val==1)
		{
			 pular1++;
		}
		if(val==2)
		{
			pular2++;
		}
		if(val==3)
		{
			pular3++;
		}        
		if(val==4)
		{
			pular4++;
		}
		jogo.getJogador().addPontos(-1);
		
	}
	public void zerarpulo(int val){
		if(val==1)
		{
			 pular1=0;
		}
		else if(val==2)
		{
			pular2=0;
		}
		else if(val==3)
		{
			pular3=0;
		}        
		else 
		{
			pular4=0;
		}
		
	}

	public String showJogador() {
		return String.format("%d", jogo.getJogador().getPontos());
	}

	private String showCarta(Carta carta) {
		return String.format("%d%c", carta.getValor(), carta.getNaipe());
	}

	public String showMesa() {

		
		return showCarta(jogo.getMesa());
	}

	public String showCartaJogador() {
		    cartaJogador = null;
			cartaJogador = jogo.drawCarta();

		return showCarta(cartaJogador);
	}

	// defifir a quantidade de jogador
	public void definirqJogador() {
int validar=0;

		while (validar==0) {
			System.out.println("Numero de jogadores? ");
			nunj = teclado.nextInt();
		if(nunj==1||nunj==2||nunj==3||nunj==4){
     
		v =nunj;
		jogo.setOnline(v);
		jogo.setNunj(nunj);
		validar++;
		} else
			System.out.println("opção invalida"); 
			
		}
		}

	

	// buscar o numero de jogador
	public int getNunJogador() {

		return nunj;
	}

	public int getvalor() {

		return valor;
	}

	public int getPosicao() {

		return jogo.getposicao();
	}

	public String getvervalor(int valor) {
		verificarvalores = jogo.posivalores(valor);
		return verificarvalores;

	}
	public String getGanhador()
	{
		return jogo.getGanhador();
	}
	
	public void resetcarta()
	{
		cartaJogador = null;
	}
	

	
}
