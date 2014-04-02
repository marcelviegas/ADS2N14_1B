package com.senac.view;

import com.senac.controller.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class view {

	private static Scanner teclado = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		controller contr = new controller();
		String nome;
		int Tconta, nconta;
		double rs;
		int op = 0;
		boolean controlar = true;
		System.out.println("       BEM VINDO AO SISTEMA BANCARIO\n");
		do {
			
		
		 try{
		while (op < 1) {
			System.out
					.println("Digite a opção desejada:\n \n1- Criar conta\n\n2- Depositar\n\n3- Realizar Saque\n \n4- Realizar investimentos\n\n5- Consultar saldo\n\n6- SAIR");

			op = teclado.nextInt();
			switch (op) {
			case 1:
				System.out.println("Nome do Cliente: ");
				nome = teclado.next();
				System.out
						.println("tipo de conta: \n1- Conta comum \n2- Conta Especial\n\n3- Conta de investimentos\n\n");
				Tconta = teclado.nextInt();
				contr.criarConta(nome, Tconta);

				op = 0;
				break;

			case 2:
				System.out.println("Numero da conta: ");
				nconta = teclado.nextInt();
				System.out.println("valor: ");
				rs = teclado.nextDouble();
				System.out.println();
				contr.deposito(nconta, rs);
				op = 0;
				break;
			case 3:
				System.out.println("Numero da conta: ");
				nconta = teclado.nextInt();
				System.out.println("valor: ");
				rs = teclado.nextDouble();
				contr.saque(nconta, rs);
				op = 0;

				break;
			case 4:
				System.out.println("Numero da conta: ");
				nconta = teclado.nextInt();
				System.out.println("valor da taxa: ");
				rs = teclado.nextDouble();
				contr.investimento(nconta, rs);
				op = 0;
				break;
			case 5:
				System.out.println("Numero da conta: ");
				nconta = teclado.nextInt();

				op = 0;
				break;
			case 6:
				System.out.println("VOCÊ ESCOLHEU A OPÇÃO SAIDA ");

				op = 1;
				break;
			default:
				System.err.println("DIGITO INVALIDO DIGITE NOVAMENTE");
				op = 0;
				break;
			}
           controlar=false;
		}
		 
	}
		 catch(InputMismatchException e){
			 System.err.println("Só é valido digitos inteiros, tente novamente de 1 a 6");
			 teclado.next();
		 }
		 
	} while (controlar);
		 
	}

}
