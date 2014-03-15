package com.senac.agenda.apps.Matching.controller;

import com.senac.agenda.*;
import com.senac.apps.Matching.model.Pessoa;

public class AgendaController {
	private Telefone[] fone = new Telefone[50];
	private Pessoa PessoaVector[] = new Pessoa[50];
	private String[] nome1 = new String[10];
	private String[] nome2 = new String[5];
	private String[] end1 = new String[10];
	private String[] end2 = new String[5];
	private String[] tel1 = new String[10];
	private String[] tel2 = new String[5];
	private int cont = 0;
	int pref = 0;
	int vardd;
	String numero;

	public AgendaController() {

	}
    //metodo para criar os objetos e sortear eles
	public void SetObjetos() {
		nome1[0] = "joel";
		nome1[1] = "manoel";
		nome1[2] = "pedro";
		nome1[3] = "Esmael";
		nome1[4] = "Israel";
		nome1[5] = "Godofredo";
		nome1[6] = "Ronete";
		nome1[7] = "Margarete";
		nome1[8] = "Raquete";
		nome1[9] = "Juliete";

		nome2[0] = "Silva";
		nome2[1] = "Machado";
		nome2[2] = "Reis";
		nome2[3] = "Silveira";
		nome2[4] = "Azevedo";

		end1[0] = "Abri";
		end1[1] = "Vinte e um";
		end1[2] = "Cinco";
		end1[3] = "Marco";
		end1[4] = "Amazonas";
		end1[5] = "Otavio rocha";
		end1[6] = "Castelo";
		end1[7] = "Branco";
		end1[8] = "Barão";
		end1[9] = "Quentino";

		end2[0] = "Jucelino";
		end2[1] = "Kubicheque";
		end2[2] = "euripedes";
		end2[3] = "aurelio";
		end2[4] = "Flores";

		tel1[0] = "11";
		tel1[1] = "22";
		tel1[2] = "33";
		tel1[3] = "44";
		tel1[4] = "55";
		tel1[5] = "66";
		tel1[6] = "77";
		tel1[7] = "88";
		tel1[8] = "99";
		tel1[9] = "10";

		tel2[0] = "12";
		tel2[1] = "34";
		tel2[2] = "56";
		tel2[3] = "78";
		tel2[4] = "91";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				pref++;

				if (pref == 4) {
					pref = 1;
				}
				if (pref == 1) {
					numero = "4068-" + tel1[j] + tel2[i];
					vardd = 51;
				}

				if (pref == 2) {
					numero = "5099-" + tel1[j] + tel2[i];
					vardd = 54;
				}
				if (pref == 3) {
					numero = "7011-" + tel1[j] + tel2[i];
					vardd = 59;
				}
				int tipo = 1;
				fone[cont] = new Telefone(vardd, numero, tipo);

				PessoaVector[cont] = new Pessoa(nome1[j] + " " + nome2[i],
						end1[j]+" "+end2[i], fone[cont]);

				cont++;

			}

		}
	}
    //metodo para imprir
	public void ImprimeVetor() {
		for (int t = 0; t < 50; t++) {

			System.out.println("Nome: " + PessoaVector[t].getNome()
					+ " \nEndereço: " + PessoaVector[t].getEndereco());
			if (PessoaVector[t].getFone().getTipoTelefone() == 1)
				System.out.print("tipo de telefone residencial "
						+ PessoaVector[t].getFone().getDdd() + "-"
						+ PessoaVector[t].getFone().getNumero() + "\n\n");
			if (PessoaVector[t].getFone().getTipoTelefone() == 2)
				System.out.print("tipo de telefone celular "
						+ PessoaVector[t].getFone().getDdd() + "-"
						+ PessoaVector[t].getFone().getNumero() + "\n\n");
			if (PessoaVector[t].getFone().getTipoTelefone() == 3)
				System.out.print("tipo de telefone comercial"
						+ PessoaVector[t].getFone().getDdd() + "-"
						+ PessoaVector[t].getFone().getNumero() + "\n\n");
		}

	}
}
