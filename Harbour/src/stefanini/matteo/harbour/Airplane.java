package stefanini.matteo.harbour;

public class Airplane extends Invasore{
	
	private int alphaWeapon;
	private int betaWeapon;
	
	public int power(){
		return (alphaWeapon * 10)
				+ (betaWeapon * 25);
	}
	
	public void setP(){
		this.setP(power());
	}

	public int getAlphaWeapon() {
		return alphaWeapon;
	}

	public void setAlphaWeapon(int alphaWeapon) {
		this.alphaWeapon = alphaWeapon;
	}

	public int getBetaWeapon() {
		return betaWeapon;
	}

	public void setBetaWeapon(int betaWeapon) {
		this.betaWeapon = betaWeapon;
	}
	
	
}
