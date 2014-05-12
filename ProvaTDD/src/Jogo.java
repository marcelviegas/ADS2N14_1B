import java.util.Scanner;

public class Jogo {
	private static Scanner teclado = new Scanner(System.in);

	/**
	 * @param args
	 * @throws SemCombustivelException 
	 * @throws combustivelCheioException 
	 */
	public static void main(String[] args) throws SemCombustivelException, combustivelCheioException {
Deserto des = new Deserto();
char op;
System.out.println("BEM VINDO AO JOGO DO DESERTO\n");


des.iniciarPartida();	
boolean fjogo = false;
while (fjogo == false) {
	
	System.out.println("\nVoce tem as seguintes opções\n A - AVANÇAR \n V - VOLTAR \n C - CARREGAR \n D - DESCARREGAR");
	op = teclado.next().toUpperCase().charAt(0);


switch (op) {
		case 'A':
			des.avancar();
			des.caminhoDeserto();
			if(des.getPosicao()==10)
			{
				fjogo=true;
			}
			break;

		case 'V':
			des.voltar();
			des.caminhoDeserto();
			
		
		break;
		case 'C':
			des.carregar();
		
		break;
		case 'D':
			des.descarregar();
		
		break;
		default:
			System.out.println("OPCAO INVALIDA, DIGITE NOVAMENTE");
			break;
		}
}

	}
}
