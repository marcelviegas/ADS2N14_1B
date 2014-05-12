import static org.junit.Assert.*;

import org.junit.Test;

public class primeiroTeste {

	Deserto des = new Deserto();

	@Test
	public void testInit() {
		des.iniciarPartida();
		assertEquals(des.getPosicao(), 0);
		assertEquals(des.getCombustivel(), 6);
	}

	@Test
	public void TestAvanc() throws SemCombustivelException {
		des.iniciarPartida();
		int pos = des.getPosicao();
		int comb = des.getCombustivel();

		des.avancar();

		assertEquals(pos + 1, des.getPosicao());
		assertEquals(comb - 1, des.getCombustivel());

	}
	
	@Test
	public void TestVoltar() throws SemCombustivelException {
		des.iniciarPartida();
		des.avancar();
		int pos = des.getPosicao();
		int comb = des.getCombustivel();

		des.voltar();

		assertEquals(pos -1, des.getPosicao());
		assertEquals(comb -1, des.getCombustivel());

	}

    @Test 
    public void Testcarregar() throws SemCombustivelException, combustivelCheioException
    {
    	des.iniciarPartida();
		des.avancar();
		des.voltar();
		int comb = des.getCombustivel();
		des.carregar();
		assertEquals(comb+1, des.getCombustivel());
		
    }
@Test
    public void Testdescarregar() throws SemCombustivelException
    {
    	des.iniciarPartida();
		des.avancar();
		int comb = des.getCombustivel();
		int pos  = des.getPosicao();		
		des.descarregar();
		assertEquals(1,des.getUnidade(pos));
		assertEquals(comb-1, des.getCombustivel());			
    } 



}
