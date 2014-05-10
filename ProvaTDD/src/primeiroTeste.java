import static org.junit.Assert.*;

import org.junit.Test;


public class primeiroTeste {

	
	Deserto des = new Deserto();
	@Test
		public void testInit() {
            des.iniciarPartida();
			assertEquals(des.getPosicao(), 0);
            assertEquals(des.getCombustivel(),6);
		}
		
	@Test 
	  public void TestAvanc() throws SemCombustivelException
	{
		des.iniciarPartida();
	  int pos=des.getPosicao();
	  int comb=des.getCombustivel();
	  
	  des.avancar();
	  
	  assertEquals(pos+1, des.getPosicao());
	  assertEquals(comb-1, des.getCombustivel());
		
		
	}
		
	}






