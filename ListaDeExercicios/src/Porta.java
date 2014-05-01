public class Porta {

	private boolean aberta;
	private boolean trancada;
	private int fechadura;
	private comodo fora;
	private comodo dentro;
	

	public Porta(int fechadura,comodo cmd,comodo cmd2) {
		this.aberta=true;
		this.trancada = false;
		this.fechadura = fechadura;
		
	}

	public comodo getFora() {
		return fora;
	}

	public comodo getDentro() {
		return dentro;
	}

	public void setFora(comodo fora) {
		this.fora = fora;
	}

	public void setDentro(comodo dentro) {
		this.dentro = dentro;
	}

	public void fechar() {
		aberta = false;
	}

	public void abrir() throws PortaTrancadaException {
		if (trancada)
			throw new PortaTrancadaException();
		aberta = true;
	}

	public void trancar(chave chave) throws ChaveinvalidaException {

		if (chave.getCodigo() == fechadura)
			trancada = true;
		else
			throw new ChaveinvalidaException();
	}

	public void destrancar(chave chave) throws ChaveinvalidaException {
		if (chave.getCodigo() == fechadura)
			trancada = false;
		else
			throw new ChaveinvalidaException();

	}

}
