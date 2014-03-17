package com.senac.jogos.apps.Matching.controller;

import java.util.Scanner;
import com.senac.jogos.apps.Matching.model.MatchingCardGame;
import com.senac.jogos.cartas.Carta;

public class JogoController {
	private static Scanner teclado = new Scanner(System.in);
	private static MatchingCardGame jogo = new MatchingCardGame();
	private Carta cartaJogador;
	int nunj;
	int valor;
	String verificarvalores;

	public JogoController() {

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
		return String.format("%d", jogo.getJogador().getPontos());
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

	// defifir a quantidade de jogador
	public void definirqJogador() {

		System.out.println("Numero de jogadores? ");
		nunj = teclado.nextInt();
		jogo.setNunj(nunj);
		while (nunj < 1 || nunj > 4) {
			if (nunj < 1 || nunj > 4)
				System.out.println("Numero invalido digite novamente");
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

	public String getvervalor() {
		verificarvalores = jogo.posivalores();
		return verificarvalores;

	}
}
