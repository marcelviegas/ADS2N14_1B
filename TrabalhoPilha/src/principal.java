import java.util.Scanner;
public class principal {

	/**
	 * @param args
	 * @throws pilhaCheiaException 
	 * @throws pilhaVaziaexception 
	 */
	public static void main(String[] args) //throws pilhaCheiaException, pilhaVaziaexception 
	
	{   
		Scanner teclado = new Scanner(System.in);
		
		int op=0;
		boolean ok=true;
		boolean ok2=true;
		
		
		while (ok) {
			System.out.println("digite o exercicio\n1 - pilha\n2 - palindromo\nou 5 para sair");
		     op = teclado.nextInt();	
			
		     switch (op) {
			case 1:
				pilha p = new pilha(10);
				
				while (ok2) {
					System.out.println("digite a opção\n1 - empilhar\n2 - desempilhar\n3 - consultar topo \n4 - verificar tamanho\n5 - sair");
					 op = teclado.nextInt();
				
				 switch (op) {
				
				case 1:
					System.out.println("\ndigite o que vai ser empilhado: ");
					String emp;
					
					emp = teclado.next();
					p.push(emp);
					
					break;
				case 2:
					
					System.out.println("\nvocê desempilhou o(a): "+p.Peek());
					p.pull();
					
                 case 3:
					
					System.out.println("\no topo é "+p.Peek());
					
					break;
                 case 4:
 					
 					System.out.println("\ntem "+p.size()+" elementos na pilha");
 					
 					break;
                 case 5:
 					
 					ok2 = false;
 					
 					break;
				default:
					System.out.println("opcao invalida");
					break;
					
				 }
				}
				
				break;
            case 2:
            	Palindromo palin = new Palindromo();
            	String emp;
				System.out.println("escreva uma palavra para consultar se é palindromo: ");
            	emp = teclado.next();
            	if(palin.isPalindromo(emp))
            	{
            		System.out.println("parabens é um palindromo");
            	}
            	else
            		System.out.println("não é palindromo");
				break;

            case 5:
            	System.out.println("tchau");
				ok = false;
				break;

            default:
				System.out.println("Opção invalida");
				break;
			}
			
		}
		
		
        
		/*p.push("marcel");
		p.push("josnel");
		System.out.println(p.Peek());
		System.out.println(p.size());
		p.pull();
		System.out.println(p.size());
		System.out.println(p.Peek());
		*/
		
		//boolean teste=palin.isPalindromo("renner");
		//System.out.println(teste);
       // String teste="joao";
        //int n =1;
        //for(int i=0;i<10;i++)
        //{
        //	teste = teste + Integer.toString(n);
        	//System.out.println(teste);
        //}
        
		
	}

}
