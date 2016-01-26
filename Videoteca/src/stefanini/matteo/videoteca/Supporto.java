package stefanini.matteo.videoteca;

public class Supporto {

	private int prezzoOneDay;
	private int prezzoAfterOneDay;
	private int giorni;
	
	public int calcoloCostoSupporto(){
		return getPrezzoOneDay()
				+ getPrezzoAfterOneDay() * (getGiorni()-1);
	}
	
	public int getGiorni() {
		return giorni;
	}
	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}
	public int getPrezzoOneDay() {
		return prezzoOneDay;
	}
	public void setPrezzoOneDay(int prezzoOneDay) {
		this.prezzoOneDay = prezzoOneDay;
	}
	public int getPrezzoAfterOneDay() {
		return prezzoAfterOneDay;
	}
	public void setPrezzoAfterOneDay(int prezzoAfterOneDay) {
		this.prezzoAfterOneDay = prezzoAfterOneDay;
	}

	
}
