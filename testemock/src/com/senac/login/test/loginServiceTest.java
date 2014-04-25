package com.senac.login.test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;	
public class loginServiceTest {

	@Test
	public void testUsuarioAcessaSistemaQuandoSenhaEstaCorreta() {
		//preparar ambiente de teste
		Account account = mock(Account.class);
		whhen(account.passwordMatches(anyString())).thenReturn(true);
		
		AccountRepository AccountDB = mock(accountRepository);
		when(account.find(anyString())).thenReturn(account);
		//executa operações
		LoginService service = new LoginService(accountDB);
		service.login("steve", "SenhaCorreta");
	    //Verificar resultado do teste
		verify(account.times(1)).setLoggedIn(true);
		
	}

}
