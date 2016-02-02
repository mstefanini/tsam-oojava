package stefanini.matteo.videoteca;

public class Cassetta extends Supporto {
	
	public Cassetta(){
		this.setPrezzoAfterOneDay(2*100);
		this.setPrezzoOneDay(1*100);
	}

	@Override
	public int calcoloCostoSupporto() {
		return getPrezzoOneDay() + (getPrezzoAfterOneDay() * getGiorni());
	}
	
	
}
