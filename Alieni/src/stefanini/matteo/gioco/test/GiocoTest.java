package stefanini.matteo.gioco.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.gioco.Alieno;
import stefanini.matteo.gioco.Giocatore;
import stefanini.matteo.gioco.Gioco;

public class GiocoTest {

	@Test
	public void test() {
		Gioco gioco = new Gioco();
		gioco.setGiocatore(new Giocatore());
		gioco.getGiocatore().setLife(100);
		gioco.getGiocatore().setName("God");
		
		//Setup alien array
		Alieno a = new Alieno();
		a.setName("a");
		a.setDamage(5);
		Alieno b = new Alieno();
		b.setName("b");
		b.setDamage(5);
		Alieno c = new Alieno();
		c.setName("c");
		c.setDamage(5);
		Alieno d = new Alieno();
		d.setName("a");
		d.setDamage(5);
		Alieno e = new Alieno();
		e.setName("a");
		e.setDamage(5);
		Alieno[] aliens = {
				a,
				b,
				c,
				d,
				e
		};
		
		// Test damagePlayers()
		gioco.damagePlayers(aliens);
		assertEquals(75, gioco.getGiocatore().getLife());
		
		// Test controll()
		
		assertEquals(true, gioco.controll());
		
		gioco.getGiocatore().setLife(25);
		gioco.damagePlayers(aliens);
		assertEquals(false, gioco.controll());
		
	}

}
