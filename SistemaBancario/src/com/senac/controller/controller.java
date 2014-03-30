package com.senac.controller;

import java.util.Scanner;
import com.senac.model.*;

public class controller {
	private static Scanner teclado = new Scanner(System.in);
	cliente cliente;
	Conta conta1[] = new Conta[10];
	Especial conta2[] = new Especial[10];
	investimento conta3[] = new investimento[10];
	int nc1 = 0;
	int nc2 = 0;
	int nc3 = 0;
	int nc = 1;
	int conf;
	boolean tlogico = false;

	public void criarConta(String texto, int valor) {
		cliente = new cliente(texto, valor);
		switch (valor) {
		case 1:
			conta1[nc1] = new Conta();
			conta1[nc1].setCliente(cliente);
			conta1[nc1].setNumConta(nc);
			System.out.println("Cliente " + conta1[nc1].getCliente().getNome()
					+ "o numero da sua conta é:" + conta1[nc1].getNumConta()
					+ " Conta comum aberta com sucesso! ");
			conta1[nc1].setSaldo(0);
			nc++;
			nc1++;
			break;
		case 2:
			conta2[nc2] = new Especial();
			conta2[nc2].setCliente(cliente);
			conta2[nc2].setNumConta(nc);
			System.out.println("Cliente " + conta2[nc2].getCliente().getNome()
					+ "o numero da sua conta é:" + conta2[nc2].getNumConta()
					+ " Conta Especial aberta com sucesso! ");

			conta2[nc2].setSaldo(0);
			nc2++;
			nc++;
			break;
		case 3:
			conta3[nc3] = new investimento();
			conta3[nc3].setCliente(cliente);
			conta3[nc3].setNumConta(nc);
			conta3[nc3].setSaldo(0);
			System.out.println("Cliente " + conta3[nc3].getCliente().getNome()
					+ "o numero da sua conta é:" + conta3[nc3].getNumConta()
					+ " Conta investimentos aberta com sucesso! ");
			nc++;
			nc3++;
			break;

		default:
			System.out
					.println("não existe esse tipo de conta verificar com o gerente bancariario!");
			break;
		}

	}

	public void deposito(int n, double vdeposito) {

		for (int i = 0; i < nc1; i++) {
			if (conta1[i].getNumConta() == n) {
				System.out.println("Você deseja depositar:R$ " + vdeposito
						+ " Na conta de: " + conta1[i].getCliente().getNome()
						+ "\n1 - sim\n2 - não");
				conf = teclado.nextInt();
				if (conf == 1) {
					conta1[i].Depositar(vdeposito);
					tlogico = true;
				} else
					System.out.println("da proxima faça com mais atencao");
			}
		}
		for (int i = 0; i < nc2; i++) {
			if (conta2[i].getNumConta() == n) {
				System.out.println("Você deseja depositar:R$ " + vdeposito
						+ " Na conta de: " + conta2[i].getCliente().getNome()
						+ "\n1 - sim\n2 - não");
				conf = teclado.nextInt();
				if (conf == 1) {
					conta2[i].Depositar(vdeposito);
					tlogico = true;
				} else
					System.out.println("da proxima faça com mais atencao");
			}
		}

		for (int i = 0; i < nc3; i++) {
			if (conta3[i].getNumConta() == n) {
				System.out.println("Você deseja depositar:R$ " + vdeposito
						+ " Na conta de: " + conta3[i].getCliente().getNome()
						+ "\n1 - sim\n2 - não");
				conf = teclado.nextInt();
				if (conf == 1) {
					conta3[i].Depositar(vdeposito);
					tlogico = true;
				} else
					System.out.println("da proxima faça com mais atencao");
			}
		}
		
		if(tlogico==true)
		{
			System.out.println("Deposito realizado com sucesso!");
		} else System.out.println("conta invalida!");

	}

	public void versaldo()
	{
		//System.out.println(conta1[0].getSaldo());
		//System.out.println(conta1[1].getSaldo());
	}
	
	
}
