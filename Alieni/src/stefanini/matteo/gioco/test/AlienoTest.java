package stefanini.matteo.gioco.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.gioco.Alieno;

public class AlienoTest {

	@Test
	public void test() {
		Alieno alieno = new Alieno();
		alieno.setName("Prova");
		alieno.setDamage(100);
		
		assertEquals("Prova", alieno.getName());
		assertEquals(100, alieno.getDamage());
	}

}
