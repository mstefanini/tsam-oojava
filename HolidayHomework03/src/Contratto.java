
public class Contratto {
	private int stipendio;
	
	float get(){
		return this.stipendio/100;
	}
	
	void set(float x){
		this.stipendio = (int)(x * 100);
	}
}
