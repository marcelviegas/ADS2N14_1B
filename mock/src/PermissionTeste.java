import static org.junit.Assert.*;

import org.junit.Test;


public class PermissionTeste {

	@Test
	public void test() {
		User userjoe = new mock(User.class);
		when(userjoe.getnome()).thenReturn("joe");
		Permission permission = new Permission();
		assertTrue(permission.canAcess(userjoe,portal));
		assertfalse(permission.canAcess(userjoe,intranet));
	}

}
