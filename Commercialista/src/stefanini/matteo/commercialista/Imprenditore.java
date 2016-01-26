package stefanini.matteo.commercialista;

public class Imprenditore extends Cliente {
	private String piva;
	private String ragSociale;

	private int nfatture;

	public int calcoloCosto(){
		if(nfatture <= 100)
			return 50000;
		else
			return 50000 + ((nfatture - 100) * 100);
			
	}
	
	
	public String getRagSociale() {
		return ragSociale;
	}

	public void setRagSociale(String ragSociale) {
		this.ragSociale = ragSociale;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public int getNfatture() {
		return nfatture;
	}

	public void setNfatture(int nfatture) {
		this.nfatture = nfatture;
	}
	
	
	
	
	
}
