package stefanini.matteo.azienda.base;

public class Main {
	static public void main(String[] args){
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
		
		System.out.println(azienda.stipendi());
	}
}
