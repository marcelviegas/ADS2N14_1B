public class Lampada {
	private boolean ligado=false;



	public void ligar() {
		ligado = true;
	}

	public void desligar() {
     ligado = false;
	}

	public boolean getStatus() {
	return ligado;
	}
}
