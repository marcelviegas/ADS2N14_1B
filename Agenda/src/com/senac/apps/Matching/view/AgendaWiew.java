package com.senac.apps.Matching.view;

import com.senac.agenda.apps.Matching.controller.*;

public class AgendaWiew {
	private static AgendaController controller = new AgendaController();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //criando os objetos
		controller.SetObjetos();
        //imprimir o vetor
		controller.ImprimeVetor();

	}

}
