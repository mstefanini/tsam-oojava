
public class Azienda {
	Dipendete[] listaDipendenti;
	String ragionesociale;
	
	int sommaStipendi(){
		int ris = 0;
		for(Dipendete dip: listaDipendenti){
			ris += dip.contratto.get();
		}
		return ris;
	}
	
}
