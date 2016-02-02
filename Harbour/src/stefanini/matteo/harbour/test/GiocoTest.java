package stefanini.matteo.harbour.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.harbour.Airplane;
import stefanini.matteo.harbour.Gioco;
import stefanini.matteo.harbour.Invasore;
import stefanini.matteo.harbour.PortoNavale;
import stefanini.matteo.harbour.Submarine;

public class GiocoTest {

	@Test
	public void test() {
		Gioco gioco = new Gioco();
		gioco.setPorto(new PortoNavale());
		gioco.getPorto().setArea(5000);
		
		Submarine sub = new Submarine();
		sub.setWeapon(100);
		sub.setWeigth(15.0f);
		sub.setP();
		
		Airplane plane = new Airplane();
		plane.setAlphaWeapon(5);
		plane.setBetaWeapon(10);
		plane.setP();
		
		assertEquals(4, gioco.damageTaken(new Invasore[]{sub, plane}));
	}

}
