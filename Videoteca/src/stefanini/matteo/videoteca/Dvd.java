package stefanini.matteo.videoteca;

public class Dvd extends Supporto {

	public Dvd(){
		this.setPrezzoAfterOneDay(2*100);
		this.setPrezzoOneDay((int)(1.5*100));
	}
	
	public int calcoloCostoSupporto(){
		if(getGiorni() == 1)
			return getPrezzoOneDay();
		else if(getGiorni() == 2)
			return getPrezzoOneDay()*2;
		else
			return getPrezzoOneDay()*2 +
					getPrezzoAfterOneDay() * (getGiorni() - 2);
	}
	


}
