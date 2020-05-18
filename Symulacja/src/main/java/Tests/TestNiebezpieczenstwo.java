package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import KlasaSpoleczna.*;
import Niebezpieczenstwo.*;

public class TestNiebezpieczenstwo {

	@Test
	public void testPolozeniaNiebezpieczenstwa() {
		//Test odpowiednie przypisania polozenia
		GenerujNiebezpieczenstwo nieb = new GenerujNiebezpieczenstwo(5, 50);
		
		assertEquals(5, nieb.getXniebezpieczenstwo());
		assertEquals(50, nieb.getYniebezpieczenstwo());
	}
	
	@Test
	public void testZmniejszIloscPopulacji() {
		//Test sprawdz czy klasa zabi³a odpowienia liczbe osob
		GenerujNiebezpieczenstwo nieb = new GenerujNiebezpieczenstwo(5,5);
		KlasaSpoleczna niew = new Niewolnicy(5,5);
		KlasaSpoleczna rzem = new Rzemieslnicy(5,5);
		KlasaSpoleczna arys = new Arystokracja(5,5);
		
		if(nieb.getZabojca() instanceof Zlodzieje) {
			arys.setPopulacja(arys.getPopulacja() - nieb.getZabojca().ZmniejszIloscPopulacja());
			assertTrue(arys.getPopulacja() >= -2);
		}
		if(nieb.getZabojca() instanceof Bandyci) {
			rzem.setPopulacja(rzem.getPopulacja() - nieb.getZabojca().ZmniejszIloscPopulacja());
			assertTrue(niew.getPopulacja() >= -2);
		}
		if(nieb.getZabojca() instanceof DzikieZwierzeta) {
			niew.setPopulacja(niew.getPopulacja() - nieb.getZabojca().ZmniejszIloscPopulacja());
			assertTrue(rzem.getPopulacja() >= -2);
		}
		
		
	}

}
