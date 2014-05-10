
public class Deserto {
	int posicao;
	int combustivel;
	int unidade[] = new int[10];
	public Deserto()
	{
		
	}
    public int getUnidade(int posicao)
    {
    	return unidade[posicao];
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

	public void voltar() throws SemCombustivelException {
		if(getCombustivel()>0&&getPosicao()>0)
		{
			combustivel--;
			posicao--;
			
		}
		else
		{
			throw new SemCombustivelException();
		}
		
	}

	public void carregar() throws combustivelCheioException {
		if(getCombustivel()==6)
		{
			throw new combustivelCheioException();
		}
		else
		{
			combustivel++;
		}
		
	
	}
	public void descarregar()
	{
		
		
	}

}
