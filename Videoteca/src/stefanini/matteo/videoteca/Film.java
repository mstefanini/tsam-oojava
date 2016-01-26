package stefanini.matteo.videoteca;

public class Film {
	
	private String titolo;
	private String regista;
	private String annoProduzione;
	private String[] attoriPrincipali;
	
	private Supporto supporto;
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public String getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(String annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String[] getAttoriPrincipali() {
		return attoriPrincipali;
	}

	public void setAttoriPrincipali(String[] attoriPrincipali) {
		this.attoriPrincipali = attoriPrincipali;
	}

	public Supporto getSupporto() {
		return supporto;
	}

	public void setSupporto(Supporto supporto) {
		this.supporto = supporto;
	}
	
}
