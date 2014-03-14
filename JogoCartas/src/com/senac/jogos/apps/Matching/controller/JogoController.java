package com.senac.jogos.apps.Matching.controller;

import java.util.Scanner;
import com.senac.jogos.apps.Matching.model.MatchingCardGame;
import com.senac.jogos.cartas.Carta;

public class JogoController {
	private static Scanner teclado = new Scanner(System.in);
	private MatchingCardGame jogo;
	private Carta cartaJogador;
	
	int nunj = 0;

	public JogoController() {
		jogo = new MatchingCardGame();
		cartaJogador = null;
	}

	public void playTurno() {
		int pontos = jogo.matchCarta(cartaJogador);
		jogo.getJogador().addPontos(pontos);
		// descartar carta
		jogo.setMesa(cartaJogador);
		cartaJogador = null;
	}

	public String showJogador() {
		return String.format("Pontos: %d", jogo.getJogador().getPontos());
	}

	private String showCarta(Carta carta) {
		return String.format("%d%c", carta.getValor(), carta.getNaipe());
	}

	public String showMesa() {
		return showCarta(jogo.getMesa());
	}

	public String showCartaJogador() {
		if (cartaJogador == null)
			cartaJogador = jogo.drawCarta();
		
		return showCarta(cartaJogador);
	}

	public void definirqJogador() {
		int nunj = 0;
		while (nunj < 1 || nunj > 4) {
			System.out.println("Numero de jogadores? ");
			nunj = teclado.nextInt();
			if (nunj < 1 || nunj > 4)
				System.out.println("Numero invalido digite novamente");
		}
		

	}
	public int getNunJogador()
	{
		
		return nunj;
	}
	
	
	
	

}
