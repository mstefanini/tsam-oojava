package stefanini.matteo.gioco.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.gioco.Giocatore;

public class GiocatoreTest {

	@Test
	public void test() {
		// Test name and life
		Giocatore giocatore = new Giocatore();
		giocatore.setLife(100);
		giocatore.setName("Matteo");
		
		assertEquals(100, giocatore.getLife());
		assertEquals("Matteo", giocatore.getName());
		
		// Test takeDamage
		giocatore.takeDamage(100);
		assertEquals(0, giocatore.getLife());
	}

}
