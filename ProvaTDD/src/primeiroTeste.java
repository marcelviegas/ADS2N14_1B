import static org.junit.Assert.*;

import org.junit.Test;


public class primeiroTeste {

	
	Deserto des = new Deserto();
	@Test
		public void testInit() {

			assertEquals(des.getPosicao(), 0);
            assertEquals(des.getCombustivel(),6);
		}
		
		
	}






