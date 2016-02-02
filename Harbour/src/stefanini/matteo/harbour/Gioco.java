package stefanini.matteo.harbour;

public class Gioco {
	
	private PortoNavale porto;
	
	public int damageTaken(Invasore[] enemys){
		int combo = 0;
		boolean survive = true;
		while(survive){
			for(Invasore i: enemys){
				combo++;
				porto.getDamage(Math.round(i.getP() * 1.5f));
				if(!survive()){
					survive = false;
					break;
				}
			}
		}
		return combo;
	}
	
	public boolean survive(){
		if(porto.getArea() <= 0)
			return false;
		else
			return true;
	}

	public PortoNavale getPorto() {
		return porto;
	}

	public void setPorto(PortoNavale porto) {
		this.porto = porto;
	}
	
	

}
