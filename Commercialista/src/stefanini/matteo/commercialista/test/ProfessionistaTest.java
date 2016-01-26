package stefanini.matteo.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.commercialista.Professionista;

public class ProfessionistaTest {

	@Test
	public void testCalcoloCosto() {
		Professionista pro = new Professionista();
		pro.setNfatture(100);
		assertEquals(10000, pro.calcoloCosto());
	}

}
