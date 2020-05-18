package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Towar.Towar;

public class TestTowar {

	@Test
	public void testPolozenia() {
		Towar towar = new Towar(5, 15);
		
		assertEquals(5, towar.getXtowar());
		assertEquals(15, towar.getYtowar());
	}
	
	@Test
	public void testZawartosci() {
		Towar towar = new Towar(5, 5);
		//3 bo przy ziarnie generatora tyle wynosi liczba utowrzonych elementow
		assertEquals(3, towar.getJedzenie());
		assertEquals(3, towar.getMaterialy());
		assertEquals(3, towar.getNarzedzia());
		assertEquals(3, towar.getTowary());
		assertEquals(3, towar.getUbrania());
		assertEquals(3, towar.getZloto());
	}

}
