package stefanini.matteo.commercialista;

public class Cliente {
	private String name;
	private String surname;
	private String cf;
	
	public int calcoloCosto(){
		return -1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
}
