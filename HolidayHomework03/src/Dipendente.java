
public class Dipendente {
	String nome;
	String cognome;
	int anzianita;
	Contratto contratto;
	
	Dipendente(String i, String c, int a, Contratto q){
		this.nome = i;
		this.cognome = c;
		this.anzianita = a;
		this.contratto = q;
	}
}
