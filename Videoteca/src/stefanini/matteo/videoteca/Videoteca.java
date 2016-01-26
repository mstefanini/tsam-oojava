package stefanini.matteo.videoteca;

public class Videoteca {
	
	Film[] films;
	
	
	public int costoNoleggio(){
		int costo = 0;
		for(Film film: films){
			costo += film.getSupporto().calcoloCostoSupporto();
		}
		return costo;
	}
	
	
	public Film[] getFilms() {
		return films;
	}
	public void setFilms(Film[] films) {
		this.films = films;
	}

}
