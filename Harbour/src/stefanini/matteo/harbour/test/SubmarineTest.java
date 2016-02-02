package stefanini.matteo.harbour.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.harbour.Submarine;

public class SubmarineTest {

	@Test
	public void test() {
		Submarine sub = new Submarine();
		sub.setWeapon(100);
		sub.setWeigth(15.0f);
		sub.setP();
		
		assertEquals(1500, sub.getP());
	}

}
