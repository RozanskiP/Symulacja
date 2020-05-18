package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import KlasaSpoleczna.*;

public class TestKlasaSpoleczna {

	@Test
	public void testPolozenie() {
		KlasaSpoleczna niew = new Niewolnicy(5, 15);
		KlasaSpoleczna rzem = new Rzemieslnicy(5, 15);
		KlasaSpoleczna arys = new Arystokracja(5, 15);
		
		assertEquals(niew.getXpolozenie(), 5);
		assertEquals(niew.getYpolozenie(), 15);
		assertEquals(rzem.getXpolozenie(), 5);
		assertEquals(rzem.getYpolozenie(), 15);
		assertEquals(arys.getXpolozenie(), 5);
		assertEquals(arys.getYpolozenie(), 15);
	}
	
	@Test
	public void testZawartosc() {
		KlasaSpoleczna niew = new Niewolnicy(5, 5);
		KlasaSpoleczna rzem = new Rzemieslnicy(5, 5);
		KlasaSpoleczna arys = new Arystokracja(5, 5);
		
		//0 bo przy ziarnie generatora tyle wynosi liczba utowrzonych elementow
		assertEquals(0, niew.getJedzenie());
		assertEquals(0, niew.getMaterialy());
		assertEquals(0, niew.getNarzedzia());
		assertEquals(0, niew.getTowary());
		assertEquals(0, niew.getUbrania());
		assertEquals(0, niew.getZloto());
		
		assertEquals(0, rzem.getJedzenie());
		assertEquals(0, rzem.getMaterialy());
		assertEquals(0, rzem.getNarzedzia());
		assertEquals(0, rzem.getTowary());
		assertEquals(0, rzem.getUbrania());
		assertEquals(0, rzem.getZloto());
		
		assertEquals(0, arys.getJedzenie());
		assertEquals(0, arys.getMaterialy());
		assertEquals(0, arys.getNarzedzia());
		assertEquals(0, arys.getTowary());
		assertEquals(0, arys.getUbrania());
		assertEquals(0, arys.getZloto());
		
	}

}
