package stefanini.matteo.harbour;

public class Submarine extends Invasore{
	
	private int weapon;
	private float weigth;
	
	public int power(){
		return Math.round(weapon*weigth);
	}
	
	public void setP(){
		this.setP(power());
	}

	public int getWeapon() {
		return weapon;
	}

	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}

	public float getWeigth() {
		return weigth;
	}

	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}
	
	
	
}
