package com.senac.agenda;

public class Telefone {
	
 private int ddd;
 private double numero;
 private int tipoTelefone;
 
 
public Telefone(int ddd, double numero, int tipoTelefone) {

	this.ddd = ddd;
	this.numero = numero;
	this.tipoTelefone = tipoTelefone;
}


public int getDdd() {
	return ddd;
}
public void setDdd(int ddd) {
	this.ddd = ddd;
}
public double getNumero() {
	return numero;
}
public void setNumero(double numero) {
	this.numero = numero;
}
public int getTipoTelefone() {
	return tipoTelefone;
}
public void setTipoTelefone(int tipoTelefone) {
	this.tipoTelefone = tipoTelefone;
}
 
 

}
