package stefanini.matteo.videoteca;

public abstract class Supporto {

	private int prezzoOneDay;
	private int prezzoAfterOneDay;
	private int giorni;
	
	abstract public int calcoloCostoSupporto();
	
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
