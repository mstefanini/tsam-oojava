package tcappellari.interfacce.ui;


public class Activity implements ButtonInterface {
	
	public void run() {
		// il mio codice
		Button b = new Button();
		
		// voglio dire al pulsante che quando qualcuno
		// ci fa click sopra, mi informi dell'evento.
		
		// mi registro come listener dell'oggetto button.
		b.setListener(this);

		
		// UI gestita dal sistema
		
		// qualche tempo dopo qualcuno fa click.
		// simulo mediante chiamata al metodo userClick

		b.userClick(true);
	}
	
	@Override
	public void onClick(boolean b) {
		System.out.println("Grazie per aver premuto il pulsante, longpress? " + b);
	}
	
	

	
	public static void main(String[] args) {		
		Activity activity = new Activity();
		activity.run();
		
	}




	
}
