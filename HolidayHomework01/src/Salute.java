
public class Salute {
	Persona persona;

	Salute(Persona x){
		this.persona = x;
	}
	
	void BMR(){
		if(persona.sesso == 'f')
			this.BMRf();
		else
			this.BMRm();
	}
	
	void BMRf(){
		double MB = 655 + (9.6 * persona.peso) + 
				((1.8 * persona.altezza) * (4.7 * persona.eta));
		this.percentage(MB);
	}
	
	void BMRm(){
		double MB = 655 + (13.8 * persona.peso) + 
				((1.8 * persona.altezza) * (4.7 * persona.eta));
		this.percentage(MB);
	}
	
	void percentage(double ris){
		switch(persona.attivita){
		case "sedentario":
			System.out.println(ris + (ris/100)*20);
			break;
		case "moderatamente attivo":
			System.out.println(ris + (ris/100)*30);
			break;
		case "attivo":
			System.out.println(ris + (ris/100)*40);
			break;
		case "molto attivo":
			System.out.println(ris + (ris/100)*50);
			break;
		default:
			System.out.println("Qualcosa non va, percentage");
			break;
		}
	}
	

}
