package stefanini.matteo.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.videoteca.Bluray;

public class BlurayTest {

	@Test
	public void testCalcoloCostoSupporto() {
		Bluray bluray = new Bluray();
		bluray.setGiorni(1);
		assertEquals(100, bluray.calcoloCostoSupporto());
		bluray.setGiorni(3);
		assertEquals(441, bluray.calcoloCostoSupporto());
	}

}
