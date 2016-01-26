package stefanini.matteo.commercialista;


public class Commercialista {
	private Cliente[] clienti;
	
	public int calcolo(){
		int conto = 0;
		for(Cliente c: clienti){
			conto += c.calcoloCosto();
		}
		return conto;
	}

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	
	
}
