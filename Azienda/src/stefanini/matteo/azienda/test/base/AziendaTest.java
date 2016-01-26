package stefanini.matteo.azienda.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.azienda.base.Azienda;
import stefanini.matteo.azienda.base.ContrattoLavoro;
import stefanini.matteo.azienda.base.Dipendente;

public class AziendaTest {

	@Test
	public void testStipendi() {
		Azienda azienda = new Azienda();
		azienda.setRagioneSociale("0000");
		azienda.setPiva("0000");
		Dipendente d = new Dipendente();
		d.setNome("Scemo");
		d.setCognome("Più scemo");
		d.setContratto(new ContrattoLavoro());
		d.getContratto().setPagabase(1500*100);
		Dipendente c = new Dipendente();
		c.setNome("Scemo");
		c.setCognome("Più scemo");
		c.setContratto(new ContrattoLavoro());
		c.getContratto().setPagabase(1500*100);
		Dipendente[] arr = {
				d,
				c
		};
		azienda.setDipendenti(arr);
		assertEquals(300000, azienda.stipendi());
	}
	
	@Test
	public void testZeroDipendenti() {
		Azienda azienda = new Azienda();
		azienda.setRagioneSociale("0000");
		azienda.setPiva("0000");
		assertEquals(0, azienda.stipendi());
	}
}
