
public class Palindromo {
	pilha p2;
	pilha p1;
public Palindromo()
{
	
}

public boolean isPalindromo(String palavra) //throws pilhaCheiaException
{
	int contador=0;
	 p2 = new pilha (palavra.length());
	 p1 = new pilha (palavra.length());
    
	int j=palavra.length()-1;
	
    for(int i=0;i<palavra.length();i++)
	{
		p2.push(palavra.charAt(j));
		p1.push(palavra.charAt(i));
		
		j--;
	}

    for(int i=0;i<palavra.length();i++)
    {
    	if(p1.Peek()==p2.Peek())
    	{
    		contador++;
    	}
    }
    if(contador==palavra.length())
    {
    	return true;
    }
  return false;

}


}
