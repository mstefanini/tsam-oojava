package stefanini.matteo.gioco;

public class Gioco {
	private Giocatore giocatore;
	
	
	public void damagePlayers(Alieno[] alieni){
		for(Alieno alien: alieni){
			giocatore.takeDamage(alien.getDamage());
		}
	}
	
	public boolean controll(){
		if(giocatore.getLife() <= 0){
			System.out.println("Il giocatore ha perso");
			return false;
		}else{
			System.out.println("Il giocatore è ancora in vita");
			return true;
		}
	}

	public Giocatore getGiocatore() {
		return giocatore;
	}

	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}
	
}
