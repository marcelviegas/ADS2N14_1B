package com.senac.view;

import com.senac.model.investimento;
import java.util.Scanner;
public class view {
	private static Scanner teclado = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("BEM VINDO AO SISTEMA BANCARIO DAS GANBIARRAS");
		int op;
		System.out.println("Digite a opção desejada: \n1- Criar conta\n2- \n2- Realizar Saque \n3- Realizar investimentos");
		
		op = teclado.nextInt();
         switch (op) {
		case 1:
			
			break;

		default:
			break;
		}
	}

}
