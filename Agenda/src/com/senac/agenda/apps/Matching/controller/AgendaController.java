package com.senac.agenda.apps.Matching.controller;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



import com.senac.agenda.*;
import com.senac.apps.Matching.model.Pessoa;

public class AgendaController {
	manipularArquivos arq = new manipularArquivos();
	private Pessoa[] pessoas = new Pessoa[50];
	private Telefone tel;
	private String[] nome1 = new String[10];
	private String[] nome2 = new String[10];
	private String[] end1 = new String[10];
	private String[] end2 = new String[10];
	private String[] tel1 = new String[10];
	private String[] tel2 = new String[10];
	private String[] ddd = new String[3];
	int DDD;
	String num;
	int sort;
	int sort2;
	int sort3;
	int sort4;

	public AgendaController() {

	}

	// metodo para criar os objetos e sortear eles
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
		nome2[5] = "Pinheiro";
		nome2[6] = "freitas";
		nome2[7] = "Viegas";
		nome2[8] = "Oliveira";
		nome2[9] = "coutinho";

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
		end2[5] = "papagaio";
		end2[6] = "Quero quero";
		end2[7] = "eunive";
		end2[8] = "medeiros";
		end2[9] = "cunha";

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

		ddd[0] = "051-470";
		ddd[1] = "055-300";
		ddd[2] = "040-400";

	}
     //inseri os objetos no vetor pessoas ja sorteado
	public void inseriagenda() {
		for (int i = 0; i <50; i++) {
            pessoas[i] = new Pessoa();
			sort = (int) (Math.random() * 10);
			sort2 = (int) (Math.random() * 10);
			sort3 = (int) (Math.random() * 10);
			sort4 = (int) (Math.random() * 5);
			DDD = (int) (Math.random() * 3);
			tel = new Telefone(ddd[DDD] + "-", tel1[sort3] + tel2[sort4], DDD);
			pessoas[i].setNome(nome1[sort]+" "+nome2[sort2]);
			pessoas[i].setEndereco(end1[sort] + " " + end2[sort2]);
			pessoas[i].setFone(tel);

			// System.out.println("Nome: " + nome1[sort] + " " + nome2[sort2]);
			// sort = (int) (Math.random() * 10);
			// sort2 = (int) (Math.random() * 10);
			// System.out.println("End: " + end1[sort] + " " + end2[sort2]);

		}
	}
	
		
	
	
	//imprime as 50 possições do vetor
	public void imprimeAgenda() 
	{
		
		for(int i = 0; i < 50; i++){
			
			System.out.println("Nome: "+pessoas[i].getNome()+" \nEnd: "+pessoas[i].getEndereco());
		if(pessoas[i].getFone().getTipoTelefone()==0)
		{
			System.out.println("Telefone residencial: "+pessoas[i].getFone().getDdd()+pessoas[i].getFone().getNumero());
			
		}
		if(pessoas[i].getFone().getTipoTelefone()==1)
		{
			System.out.println("Telefone residencial: "+pessoas[i].getFone().getDdd()+pessoas[i].getFone().getNumero());
			
		}
		if(pessoas[i].getFone().getTipoTelefone()==2)
		{
			System.out.println("Telefone residencial: "+pessoas[i].getFone().getDdd()+pessoas[i].getFone().getNumero());
			
		}
		//if((pessoas[i].getFone().getTipoTelefone()==3))
		System.out.println("\n--------------------------------------\n");
		}
	}
	
	
	public void salvarcontatos()
	{
		for(int i =0; i<=20;i++)
		{
			
		String contato = pessoas[i].getNome()+"|"+pessoas[i].getEndereco()+"|"+pessoas[i].getFone().getDdd()+pessoas[i].getFone().getNumero();
			
			arq.escreverArquivo(contato);
			
		}
		
		
	}

}
