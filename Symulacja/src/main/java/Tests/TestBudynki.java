package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Budynki.*;
import RandomoweLiczby.GeneratorRandom;
import Towar.*;

public class TestBudynki {

	@Test
	public void testMennicaIlosc() {
		Towar towar1 = new Towar(0, 0);
		Towar towar1kopia = new Towar(0, 0);
		Mennica.PlusTowary(towar1);
		//Sprawdzanie czy Budynek dodaje odpowiednia ilosc towarow
		assertEquals(towar1.getJedzenie(), towar1kopia.getJedzenie()+3);
		assertEquals(towar1.getMaterialy(), towar1kopia.getMaterialy()+3);
		assertEquals(towar1.getNarzedzia(), towar1kopia.getNarzedzia()+3);
		assertEquals(towar1.getTowary(), towar1kopia.getTowary()+3);
		assertEquals(towar1.getUbrania(), towar1kopia.getUbrania()+3);
		assertEquals(towar1.getZloto(), towar1kopia.getZloto()+3);
	}
	
	@Test
	public void testWarsztatIlosc() {
		Towar towar1 = new Towar(0, 0);
		Towar towar1kopia = new Towar(0, 0);
		Warsztat.WymanazajTowary(towar1);
		//Sprawdzanie czy Budynek wymnaza w odpowiedni sposob
		assertEquals(towar1.getJedzenie(), towar1kopia.getJedzenie()*2);
		assertEquals(towar1.getMaterialy(), towar1kopia.getMaterialy()*2);
		assertEquals(towar1.getNarzedzia(), towar1kopia.getNarzedzia()*2);
		assertEquals(towar1.getTowary(), towar1kopia.getTowary()*2);
		assertEquals(towar1.getUbrania(), towar1kopia.getUbrania()*2);
		assertEquals(towar1.getZloto(), towar1kopia.getZloto()*2);
	}
	
	@Test
	public void testMennicaWarsztatPolozenie() {
		//Sprawdzanie odpowiednie przypisania dla Budynkow
		assertTrue(polozenieMennica());
		assertTrue(polozenieWarsztat());
	}
	
	
	public boolean polozenieWarsztat() {
		int X=20;
		int Y=20;
		Warsztat warsztat = new Warsztat(GeneratorRandom.RandomOd1Losowe(X), GeneratorRandom.RandomOd1Losowe(Y));
		if(warsztat.getXBudynek() >= 0 && warsztat.getYBudynek() <= X) {
			if(warsztat.getYBudynek() >= 0 && warsztat.getYBudynek() <= Y) {
				return true;
			}
		}
		return false;
	}
	
	public boolean polozenieMennica() {
		int X=20;
		int Y=20;
		Mennica mennica = new Mennica(GeneratorRandom.RandomOd1Losowe(X), GeneratorRandom.RandomOd1Losowe(Y));
		if(mennica.getXBudynek() >= 0 && mennica.getYBudynek() <= X) {
			if(mennica.getYBudynek() >= 0 && mennica.getYBudynek() <= Y) {
				return true;
			}
		}
		return false;
	}
	
}
