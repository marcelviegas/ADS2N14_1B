package com.senac.jogos.cartas;


public class Carta
{
    private char naipe;
    private int  valor;
    
    public Carta(char naipe, int valor)
    {
        switch (naipe) {
            case 'C':
            case 'O':
            case 'P':
            case 'E':
                this.naipe = naipe;
                break;
            default:
                this.naipe = 'J';
        }
        
        if (valor > 0 || valor <= 13)
            this.valor = valor;
        else {
            this.valor = '0';
            this.naipe = 'J';
        }
    }
    
    public int getValor()
    {
        return this.valor;
    }
    
    public char getNaipe()
    {
        return this.naipe;
    }
}
