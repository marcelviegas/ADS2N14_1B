import java.util.Scanner;

public class ArquivoPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		manipularArquivo arq = new manipularArquivo();
		String var=teclado.nextLine();
		arq.escreverArquivo(var);
		arq.LerArquivo();

	}

}
