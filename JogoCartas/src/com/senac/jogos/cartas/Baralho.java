package com.senac.jogos.cartas;

public class Baralho {

	private Carta[] cartas = new Carta[52];
	private int numCartas;
	
	public Baralho()
	{
		numCartas = 0;
		
		char[] naipes = {'C','O','P','E'};

		for (char naipe: naipes)
		{
			for (int valor = 1; valor <= 13; valor++)
			{
				cartas[numCartas] = new Carta(naipe,valor);
				numCartas++;
			}
		}
	}
	
	public Carta drawCarta()
	{
		int carta = (int)(Math.random() * numCartas);
		Carta sorteada = cartas[carta];

		numCartas--;
		
		cartas[carta] = cartas[numCartas]; 
		
		return sorteada;
	}
		
}
