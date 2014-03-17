package com.senac.jogos.apps.Matching.model;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.apps.Matching.controller.*;

public class MatchingCardGame {

	private Baralho baralho;

	private static JogoController contr = new JogoController();
	int posicao = -1;
	private Carta mesa;
	int qtdJogador;
	private Jogador[] jogadores = new Jogador[4];

	public MatchingCardGame() {

		baralho = new Baralho();
		mesa = baralho.drawCarta();
		// jogadores = new Jogador[qtdJogador];
		// o correto seria criar os jogadores conforme o getNunJogador mas ele
		// esta trazendo sempre nulo, não estou conseguindo buscar o valor pois
		// só consigo ter acesso a ele na classe View
		jogadores[0] = new Jogador();
		jogadores[1] = new Jogador();
		jogadores[2] = new Jogador();
		jogadores[3] = new Jogador();

		// for(int i=0;i<qtdJogador;){
		// jogadores[i] = new Jogador();
		// i++;
		// }
	}

	public void setNunj(int nunj) {

		this.qtdJogador = nunj;

	}

	public int matchCarta(Carta carta) {
		int score = -1;

		if (carta.getNaipe() == mesa.getNaipe())
			score = 1;
		if (carta.getValor() == mesa.getValor())
			score = 4;

		return score;
	}

	public void setMesa(Carta carta) {
		mesa = carta;
	}

	public Carta getMesa() {

		return mesa;
	}

	public Carta drawCarta() {
		return baralho.drawCarta();
	}

	public Jogador getJogador() {
		posicao++;
		if (posicao >= qtdJogador)
			posicao = 0;

		return jogadores[posicao];

	}

	public String posivalores() {

		String teste = " " + jogadores[0].getPontos() + " "
				+ jogadores[1].getPontos() + " " + jogadores[2].getPontos()
				+ " " + jogadores[3].getPontos();
		return teste;
	}

	public int getposicao() {

		return posicao;
	}

	public int getnunj() {
		int valor = contr.getvalor();
		return valor;
	}
}
