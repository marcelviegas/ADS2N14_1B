import java.util.Comparator;


public class CBinario {
	
	
	public CBinario()
	{
	
	}
	
	public int tamanhoPilha(int valor)
	{
		int aux = 1;
		int cont=0;
		for(int i=0;i!=1;i=0)
		{
			cont++;
			if(aux>=valor)
			{
				i=1;
			}
			else
			{
				aux = aux*2;
			}
		
		}
			
		return cont;
		
	}

	
	
	public int calcularbaseBinaria(int valor)
	{   
		pilha p1 = new pilha(tamanhoPilha(valor));
		int aux = 1;
		int cont=0;
		for(int i=0;i!=1;i=0)
		{
			cont++;
			if(aux>valor)
			{
				i=1;
			}
			else
			{   
				p1.push(aux);
				aux = aux*2;
			}
		
		}
		
		for(int i=0;i<=cont;i++)
		{
			if((Integer)p1.Peek()==aux)
			{
				
			}
			
		}
		
		
	}
	
	
	
}
