package stefanini.matteo.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.commercialista.Cliente;
import stefanini.matteo.commercialista.Commercialista;
import stefanini.matteo.commercialista.Dipendente;
import stefanini.matteo.commercialista.Imprenditore;
import stefanini.matteo.commercialista.Professionista;

public class CommercialistaTest {

	@Test
	public void testCalcolo() {
		Commercialista commercialista = new Commercialista();
		Dipendente dipendente = new Dipendente();
		Professionista professionista = new Professionista();
		professionista.setNfatture(120);
		Imprenditore imprenditore = new Imprenditore();
		imprenditore.setNfatture(500);
		commercialista.setClienti(new Cliente[]{
				dipendente,
				professionista,
				imprenditore
		});
		
		assertEquals(106000, commercialista.calcolo());
	}

}
