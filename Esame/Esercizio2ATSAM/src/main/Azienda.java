package main;

import java.util.HashMap;
import java.util.Map;

/**
 * Gestisce gli stipendi dei propri dipendenti.
 *
 */
public class Azienda {

	private String ragioneSociale;
	
	private Map<Dipendente, Integer> map = new HashMap<>();
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	/**
	 * Calcola lo stipendio di tutti i dipendenti univoci (ovvero NON
	 * vengono considerati gli stipendi di eventuali dipendenti duplicati). 
	 * @return il totale dello stipendi da pagare
	 */
	public int totaleStipendi() {
		double total = 0;
		for(Map.Entry<Dipendente, Integer> entry : map.entrySet()){
			total += entry.getKey().calcolaStipendio();
		}
		return (int) Math.round(total);
	}
	
	/**
	 * Inserisce un nuovo dipendente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addDipendente(Dipendente d) {
		if(!(map.containsKey(d)))
				map.put(d, 1);
		else{
			Integer temp = map.get(d);
			map.put(d, ++temp);
		}
	}
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un dipendente, il dipendente era già stato inserito. 
	 * @return
	 */
	public int dipendentiDuplicati() {
		int total = 0;
		for(Map.Entry<Dipendente, Integer> entry: map.entrySet()){
			if( entry.getValue().intValue() > 1)
				total++;
		}
		return total;
	}
	
	/**
	 * Dato un dipendente, restituisce il numero di volte che lo stesso
	 * dipendente è stato inserito tramite le funzione addDipendente.
	 * Nel caso che un dato dipendente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d dipendente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Dipendente d) {
		return map.get(d).intValue();
	}

}
