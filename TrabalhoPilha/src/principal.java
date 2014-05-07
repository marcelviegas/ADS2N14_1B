
public class principal {

	/**
	 * @param args
	 * @throws pilhaCheiaException 
	 * @throws pilhaVaziaexception 
	 */
	public static void main(String[] args) throws pilhaCheiaException, pilhaVaziaexception {
		pilha p = new pilha(10);
        
		p.push("marcel");
		p.push("josnel");
		System.out.println(p.Peek());
		System.out.println(p.size());
		p.pull();
		System.out.println(p.size());
		System.out.println(p.Peek());
		
	}

}
