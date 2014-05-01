package com.senac.apps.Matching.view;

import java.io.IOException;

import com.senac.agenda.apps.Matching.controller.*;

public class AgendaWiew {
	private static AgendaController controller = new AgendaController();

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        //criando os objetos
		controller.SetObjetos();
        //imprimir o vetor
		controller.inseriagenda();
		controller.imprimeAgenda();
		controller.gravardadospessoa();

	}

}
