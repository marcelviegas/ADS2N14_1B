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
	String teste;
	String ganhador;

	public MatchingCardGame() {

		baralho = new Baralho();
		mesa = baralho.drawCarta();

		jogadores[0] = new Jogador();
		jogadores[1] = new Jogador();
		jogadores[2] = new Jogador();
		jogadores[3] = new Jogador();

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

	public void setOnline(int v) {
		for (int j = 0; j < v; j++) {
			jogadores[j].setonline();
		}

	}

	public String posivalores(int val) {
		if (val == 1) {
			teste = " " + jogadores[0].getPontos();

		}
		if (val == 2) {
			teste = " " + jogadores[1].getPontos();

		}

		if (val == 3) {
			teste = " " + jogadores[2].getPontos();

		}
		if (val == 4) {
			teste = " " + jogadores[3].getPontos();

		}

		return teste;
	}

	public int getposicao() {

		return posicao;
	}

	public int getnunj() {
		int valor = contr.getvalor();
		return valor;
	}

	// foi necessario inserir o metodo getganhador para os casos de menos que 4
	// jogadores joguem e fiquem com numero negativo o ganhador seria o 4 com o
	// valor 0
	// assim é validado os jogadores online
	public String getGanhador() {

		if (jogadores[3].getonline() == 1) {
			if (jogadores[0].getPontos() > jogadores[1].getPontos()
					&& jogadores[0].getPontos() > jogadores[2].getPontos()
					&& jogadores[0].getPontos() > jogadores[3].getPontos())

			{
				ganhador = "jogador 1 é o vencedor com: "
						+ jogadores[0].getPontos() + " pontos.";

			} else if (jogadores[1].getPontos() > jogadores[0].getPontos()
					&& jogadores[1].getPontos() > jogadores[2].getPontos()
					&& jogadores[1].getPontos() > jogadores[3].getPontos())

			{

				ganhador = "jogador 2 é o vencedor com: "
						+ jogadores[1].getPontos() + " pontos.";
			} else if (jogadores[2].getPontos() > jogadores[0].getPontos()
					&& jogadores[2].getPontos() > jogadores[1].getPontos()
					&& jogadores[2].getPontos() > jogadores[3].getPontos()) {

				ganhador = "jogador 3 é o vencedor com: "
						+ jogadores[2].getPontos() + " pontos.";
			} else if (jogadores[3].getPontos() > jogadores[0].getPontos()
					&& jogadores[3].getPontos() > jogadores[1].getPontos()
					&& jogadores[3].getPontos() > jogadores[2].getPontos()) {

				ganhador = "jogador 4 é o vencedor com: "
						+ jogadores[3].getPontos() + " pontos.";
			} else
				ganhador = "EMPATE";

			return ganhador;
		}

		else if (jogadores[2].getonline() == 1) {
			if (jogadores[0].getPontos() > jogadores[1].getPontos()
					&& jogadores[0].getPontos() > jogadores[2].getPontos())

			{
				ganhador = "jogador 1 é o vencedor com: "
						+ jogadores[0].getPontos() + " pontos.";

			} else if (jogadores[1].getPontos() > jogadores[0].getPontos()
					&& jogadores[1].getPontos() > jogadores[2].getPontos()) {
				ganhador = "jogador 2 é o vencedor com: "
						+ jogadores[1].getPontos() + " pontos.";

			} else if (jogadores[2].getPontos() > jogadores[0].getPontos()
					&& jogadores[2].getPontos() > jogadores[1].getPontos()) {
				ganhador = "jogador 3 é o vencedor com: "
						+ jogadores[2].getPontos() + " pontos.";

			} else
				ganhador = "EMPATE";

		} else if (jogadores[1].getonline() == 1) {
			if (jogadores[0].getPontos() > jogadores[1].getPontos())

			{
				ganhador = "jogador 1 é o vencedor com: "
						+ jogadores[0].getPontos() + " pontos.";

			} else if (jogadores[1].getPontos() > jogadores[0].getPontos()) {
				ganhador = "jogador 2 é o vencedor com: "
						+ jogadores[1].getPontos() + " pontos.";

			} else
				ganhador = "EMPATE";

		} else
			ganhador = "VOCE GANHOU DE SI MESMO";

		return ganhador;
	}
}