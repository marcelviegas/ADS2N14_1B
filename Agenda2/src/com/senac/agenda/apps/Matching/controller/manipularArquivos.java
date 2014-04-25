package com.senac.agenda.apps.Matching.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class manipularArquivos {
	File arquivo = new File("contatos.txt");

	/**
	 * @param args
	 */
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

				// faz algo com a linha
				System.out.println(linha);
			}

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
}

