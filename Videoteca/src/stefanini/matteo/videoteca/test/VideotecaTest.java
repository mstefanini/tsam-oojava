package stefanini.matteo.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import stefanini.matteo.videoteca.Dvd;
import stefanini.matteo.videoteca.Film;
import stefanini.matteo.videoteca.Videoteca;

public class VideotecaTest {

	@Test
	public void testCostoNoleggio() {
		Videoteca video = new Videoteca();
		Film film1 = new Film();
		film1.setSupporto(new Dvd());
		film1.getSupporto().setGiorni(1);
		Film film2 = new Film();
		film2.setSupporto(new Dvd());
		film2.getSupporto().setGiorni(3);
		video.setFilms(new Film[]{
				film1,
				film2
		});
		
		
		assertEquals(650, video.costoNoleggio());
		
	}

}
