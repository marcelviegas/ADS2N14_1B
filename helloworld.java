public class helloworld {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		//Instanciando a classe
		pessoa user = new pessoa();
		//Setando o atributo
		user.setUsername("marcel");
		// TODO Auto-generated method stub
		//Imprimindo em tela concatenado com o atributo setado anteriormente
		System.out.println("hello "+user.getUsername());

	}

}

