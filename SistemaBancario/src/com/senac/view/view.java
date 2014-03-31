package com.senac.view;

import com.senac.controller.*;
import java.util.Scanner;

public class view {

	private static Scanner teclado = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    controller contr = new controller();
		String nome;
		int Tconta,nconta;
		double rs;
		int op=0;
		System.out.println("BEM VINDO AO SISTEMA BANCARIO DAS GANBIARRAS");
		while (op<1) {
			
		
		System.out.println("Digite a opção desejada: \n1- Criar conta\n2- Depositar \n3- Realizar Saque \n4- Realizar investimentos\n5- Consultar saldo\n6 SAIR");
		
		op = teclado.nextInt();
         switch (op) {
		case 1:
			System.out.println("Nome do Cliente: ");
			nome = teclado.next();
			System.out.println("tipo de conta: \n1- Conta comum \n2- Conta Especial\n3- Conta de investimentos\n\n");
			Tconta = teclado.nextInt();
			contr.criarConta(nome, Tconta);
			
			op=0;
			break;

		case 2:
			System.out.println("Numero da conta: ");
			 nconta=teclado.nextInt();
			System.out.println("valor: ");
			rs = teclado.nextDouble();
			System.out.println();
			contr.deposito(nconta, rs);
			op=0;
			break;
		case 3:
			System.out.println("Numero da conta: ");
			nconta=teclado.nextInt();
			System.out.println("valor: ");
			rs = teclado.nextDouble();
			contr.saque(nconta, rs);
			op=0;
			
			break;
		case 4:
			System.out.println("Numero da conta: ");
			nconta=teclado.nextInt();
			System.out.println("valor da taxa: ");
			rs = teclado.nextDouble();
			contr.investimento(nconta, rs);
			op=0;
			break;
		case 5:
			System.out.println("Numero da conta: ");
			nconta=teclado.nextInt();
			
			
			op=0;
			break;
		default:
			
			break;
         }
		
        
         
		}
	}

}
