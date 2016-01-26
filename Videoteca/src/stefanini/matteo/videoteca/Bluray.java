package stefanini.matteo.videoteca;

public class Bluray extends Supporto {

	public Bluray(){
		this.setPrezzoAfterOneDay(1*100);
		this.setPrezzoOneDay(1*100);
	}
	
	
	public int calcoloCostoSupporto(){
		int costo = 1;
		for(int i = 0; i <= getGiorni(); i++){
			costo += costo + (int)(costo * 0.10);
		}
		return costo;
	}

}
