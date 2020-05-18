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
		assertTrue(towar.getJedzenie() >= 0 && towar.getJedzenie() <= 5);
		assertTrue(towar.getMaterialy() >= 0 && towar.getMaterialy() <= 5);
		assertTrue(towar.getNarzedzia() >= 0 && towar.getNarzedzia() <= 5);
		assertTrue(towar.getTowary() >= 0 && towar.getTowary() <= 5);
		assertTrue(towar.getUbrania() >= 0 && towar.getUbrania() <= 5);
		assertTrue(towar.getZloto() >= 0 && towar.getZloto() <= 5);
	}

}
