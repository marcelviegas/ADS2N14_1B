package com.senac.jogos.apps.Matching.view;

import java.util.Scanner;
import static java.lang.System.*;
import com.senac.jogos.apps.Matching.controller.JogoController;

public class JogoView {

	private static Scanner teclado = new Scanner(System.in);

	private static JogoController controller = new JogoController();

	public static void main(String[] args)

	{

		// define a quantidade de jogador
		controller.definirqJogador();
		// grava a quantidade de jogador para inserir no for
		int cont = controller.getNunJogador();

		int cont2 = 1;
		// for incrementando 2 devido a mesa tirar uma carta tambem
		for (int i = 1; i <= 52; i = i + 2) {

			if (cont < cont2) {
				cont2 = 1;

			}

			System.out.println("\nVez do jogador: " + cont2);
			out.println("Carta na mesa: " + controller.showMesa()

			);

			out.print("Digite 'jogar' para jogar, 'pular' para passar a vez: ");

			String comando = teclado.next();
			if (comando.equalsIgnoreCase("JOGAR")) {
				out.println("Carta do jogador: "
						+ controller.showCartaJogador());
				controller.playTurno();
			}
			// else pula o turno
            //modificado a forma de mostrar o placar para verificar se esta sendo realizado corretamente o calculo
			out.println("Pontos do Jogador " + (cont2) + ": "
					+ controller.getvervalor());
			System.out.println("\n------------------------\n");
			cont2++;
		}
	}

}
