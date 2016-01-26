package stefanini.matteo.videoteca;

public class Bluray extends Supporto {

	public Bluray(){
		this.setPrezzoAfterOneDay(1*100);
		this.setPrezzoOneDay(1*100);
	}
	
	
	public int calcoloCostoSupporto(){
		int costo = getPrezzoOneDay();
		for(int i = 0; i < getGiorni()-1; i++){
			costo += costo + (int)(costo*0.10);
		}
		return costo;
	}

}
