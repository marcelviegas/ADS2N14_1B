
public class principal {

	/**
	 * @param args
	 * @throws pilhaCheiaException 
	 * @throws pilhaVaziaexception 
	 */
	public static void main(String[] args) //throws pilhaCheiaException, pilhaVaziaexception 
	{
        Palindromo palin = new Palindromo();
		/*p.push("marcel");
		p.push("josnel");
		System.out.println(p.Peek());
		System.out.println(p.size());
		p.pull();
		System.out.println(p.size());
		System.out.println(p.Peek());
		*/
		
		String palavra = "ROMA TIBI SUBITO MOTIBUS IBIT AMOR";
		boolean teste=palin.isPalindromo(palavra);
		System.out.println(teste);
		
	}

}
