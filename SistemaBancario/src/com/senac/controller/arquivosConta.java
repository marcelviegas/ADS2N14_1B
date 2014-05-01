package com.senac.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class arquivosConta {
	int tconta;
	File arquivo = new File("C:/Users/Marcel/ADS2N14_1B/contas.txt");
	File arquivo2 = new File("C:/Users/Marcel/ADS2N14_1B/contatos.txt");
	private static Scanner teclado = new Scanner(System.in);
	String array[] = new String[20];
	String array1[] = new String[3]; 
	//controller ct = new controller();
	/**
	 * @param args
	 */
	public String[] carregarContatos()
	{
		//String array[] = new String[getProxNumConta()-1];
		try {
			// faz a leitura do arquivo
			FileReader fr = new FileReader(arquivo2);

			BufferedReader br = new BufferedReader(fr);
			
			// Equanto houver mais linha
			int cont=0;
			while (br.ready()) {
				// lê a proxima linha
			
				String linha = br.readLine();
                //array[cont]=linha;
				array1=linha.split(";");
				array[cont]=array1[0];
				cont++;

			}

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		
		return array;
		
		
	}
	public boolean VerficarExistencia()
	{
		if (!arquivo.exists()) {
			//cria um arquivo (vazio)
		return false;
			}
		return true;
	}
	public boolean VerficarExistencia2()
	{
		if (!arquivo2.exists()) {
			//cria um arquivo (vazio)
		return false;
			}
		return true;
	}
	public void escreverArquivo(String texto){
		 
		try {
		 
		if (!arquivo.exists()) {
		//cria um arquivo (vazio)
		arquivo.createNewFile();
		}
		 
		//caso seja um diretório, é possível listar seus arquivos e diretórios
		File[] arquivos = arquivo.listFiles();
		 
		//escreve no arquivo
		FileWriter fw = new FileWriter(arquivo, true);
		 
		BufferedWriter bw = new BufferedWriter(fw);
		 
		bw.write(texto);
		 
		bw.newLine();
		 
		bw.close();
		fw.close();
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void LerArquivo() {
		try {
			// faz a leitura do arquivo
			FileReader fr = new FileReader(arquivo);

			BufferedReader br = new BufferedReader(fr);

			// equanto houver mais linhas
			while (br.ready()) {
				// lê a proxima linha
				String linha = br.readLine();

				// imprime a linha a linha
				System.out.println(linha);
			}

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	public int getProxNumConta()
	{
		int proxn=1;
		try {
			if(!VerficarExistencia())
			{
				return 1;
			}
			// faz a leitura do arquivo
			FileReader fr = new FileReader(arquivo);

			BufferedReader br = new BufferedReader(fr);

			// equanto houver mais linhas
			while (br.ready()) {
				// lê a proxima linha
				proxn++;
				String linha = br.readLine();

			
				
			}

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
        return proxn;
	}
	

}
