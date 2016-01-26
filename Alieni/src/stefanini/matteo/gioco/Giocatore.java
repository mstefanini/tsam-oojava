package stefanini.matteo.gioco;

public class Giocatore {
	private int life;
	private String name;
	
	public void takeDamage(int x){
		this.life -= x;
	}
	
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
