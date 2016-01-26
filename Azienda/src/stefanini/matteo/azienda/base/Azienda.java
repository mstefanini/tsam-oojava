package stefanini.matteo.azienda.base;

public class Azienda {
	private String ragioneSociale;
	private String piva;
	private Dipendente[] dipendenti;
	
	public int stipendi(){
		int ris = 0;
		if(dipendenti == null)
			return ris;
		for(Dipendente d: dipendenti){
			ris += d.stipendio();
		}
		return ris;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	
}
