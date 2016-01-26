package stefanini.matteo.commercialista;

public class Professionista extends Cliente{
	private String piva;
	private int nfatture;
	
	public int calcoloCosto(){
		return 50*100 + nfatture*50;
	}

	public int getNfatture() {
		return nfatture;
	}

	public void setNfatture(int nfatture) {
		this.nfatture = nfatture;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}
	
	
	
}
