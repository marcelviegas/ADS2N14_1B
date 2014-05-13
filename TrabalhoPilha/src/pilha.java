

public class pilha {
	private Object[] vetor;
	private int QuantidadeItens;

	public pilha(int tamanho) {
		this.vetor = new Object[tamanho];
		QuantidadeItens = -1;
	}

	public boolean isempty() {
		if (QuantidadeItens == -1)
			return true;
		else
			return false;
	}

	public int size() {

		return QuantidadeItens + 1;

	}

	public Object Peek() {
		if (isempty()) {
			return null;
		} else
			return vetor[QuantidadeItens];
	}

	public void pull()// throws pilhaVaziaexception 
	{
		if (isempty()) {
			//throw new pilhaVaziaexception();
		}

		else
			this.QuantidadeItens--;
	}

	public void push(Object valor) //throws pilhaCheiaException 
	{

		if(QuantidadeItens == vetor.length-1)
		{
			//throw new pilhaCheiaException();
		}
		
		else
			QuantidadeItens++;
		vetor[QuantidadeItens]=valor;
		
		
	}
}
