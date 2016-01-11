
public class Azienda {
	Dipendete[] listaDipendenti;
	String ragionesociale;
	
	float sommaStipendi(){
		float ris = 0;
		for(Dipendete dip: listaDipendenti){
			ris += dip.contratto.get() + 0.5 * dip.anzianita;
		}
		return ris;
	}
	
}
