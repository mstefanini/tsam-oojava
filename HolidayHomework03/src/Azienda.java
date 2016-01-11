
public class Azienda {
	Dipendente[] listaDipendenti;
	String ragionesociale;
	
	float sommaStipendi(){
		float ris = 0;
		for(Dipendente dip: listaDipendenti){
			ris += dip.contratto.get() + 0.5 * dip.anzianita;
		}
		return ris;
	}
	
}
