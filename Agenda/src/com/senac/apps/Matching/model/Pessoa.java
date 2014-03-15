package com.senac.apps.Matching.model;
import com.senac.agenda.*;

public class Pessoa {
	
	
	private String nome;
	private String endereco;
    private Telefone fone;
    private String []nome1 = new String [10];
    private String []nome2 = new String [5];
    private String []end1 = new String[10]; 
    private String []end2 = new String[5]; 
    private int []tel1 = new int[10]; 
    private int []tel2 = new int[5];
    
   
	public Pessoa(String nome, String endereco, Telefone fone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.fone = fone;
	}
    
	
	private void SetObjetos()
	{
		nome1[0] = "joel"; 
		nome1[1] = "manoel"; 
		nome1[2] = "pinheiro"; 
		nome1[3] = "Machado"; 
		nome1[4] = "Israel"; 
		nome1[5] = "Godofredo"; 
		nome1[6] = "Ronete"; 
		nome1[7] = "Margarete"; 
		nome1[8] = "Raquete"; 
		nome1[9] = "Silva"; 
		
		nome2[0] = "jurema";
		nome2[1] = "donete";
		nome2[2] = "leite";
		nome2[3] = "ferraz";
		nome2[4] = "Ferrari";
		
		end1[0]= "Abri";
		end1[1]= "Vinte e um";
		end1[2]= "Cinco";
		end1[3]= "Marco";
		end1[4]= "Amazonas";
		end1[5]= "Otavio rocha";
		end1[6]= "Castelo";
		end1[7]= "Branco";
		end1[8]= "Barão";
		end1[9]= "Quentino";
		
		end2[0]= "Jucelino";
		end2[1]= "Kubicheque";
		end2[2]= "euripedes";
		end2[3]= "aurelio";
		end2[4]= "Flores";	
		
		tel1[0] =11;
		tel1[1] =22;
		tel1[2] =33;
		tel1[3] =44;
		tel1[4] =55;
		tel1[5] =66;
		tel1[6] =77;
		tel1[7] =88;
		tel1[8] =99;
		tel1[9] =10;
		
		tel2[0] =12;
		tel2[1] =34;
		tel2[2] =56;
		tel2[3] =78;
		tel2[4] =91;
		
		
		
		
		
		
		
	}
	
    
}
