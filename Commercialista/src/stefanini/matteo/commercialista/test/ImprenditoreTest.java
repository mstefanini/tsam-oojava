package stefanini.matteo.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.commercialista.Imprenditore;

public class ImprenditoreTest {

	@Test
	public void testCalcoloCosto() {
		Imprenditore imp = new Imprenditore();
		imp.setNfatture(100);
		assertEquals(50000, imp.calcoloCosto());
		imp.setNfatture(150);
		assertEquals(55000, imp.calcoloCosto());
	}

}
