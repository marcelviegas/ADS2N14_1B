public class comodo {

	private String cor;
	private double tamanha;
	private String tcomodo;
	private Lampada lampada;

	public comodo() {

		this.cor = " ";
		this.tamanha = 0;
		this.tcomodo = " ";
		this.lampada = new Lampada();
	}

	public void setIluminacao(boolean iluminacao) {
		if (iluminacao) {
			lampada.ligar();
		} else {
			lampada.desligar();
		}
	}

	public boolean getIluminacao() {
		return lampada.getStatus();
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getTamanha() {
		return tamanha;
	}

	public void setTamanha(double tamanha) {
		this.tamanha = tamanha;
	}

	public String getTcomodo() {
		return tcomodo;
	}

	public void setTcomodo(String tcomodo) {
		this.tcomodo = tcomodo;
	}

}
