package stefanini.matteo.harbour.test;

import static org.junit.Assert.*;

import org.junit.Test;
import stefanini.matteo.harbour.*;

public class AirplaneTest {

	@Test
	public void test() {
		Airplane plane = new Airplane();
		plane.setAlphaWeapon(5);
		plane.setBetaWeapon(10);
		plane.setP();
		
		assertEquals(300, plane.getP());
	}

}
