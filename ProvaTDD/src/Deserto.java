
public class Deserto {
	int posicao;
	int combustivel;
	public Deserto()
	{
		
	}

	public void iniciarPartida()
	{
		this.combustivel=6;
		this.posicao=0;
	}
	public int getPosicao() {
		// TODO Auto-generated method stub
		return posicao;
	}

	public int getCombustivel() {
		// TODO Auto-generated method stub
		return combustivel;
	}

	public void avancar() throws SemCombustivelException {
		if(getCombustivel()>0)
		{
			combustivel--;
			posicao++;
			
		}
		else
		{
			throw new SemCombustivelException();
		}
		
	}

	public void voltar() {
		// TODO Auto-generated method stub
		
	}
	

}
