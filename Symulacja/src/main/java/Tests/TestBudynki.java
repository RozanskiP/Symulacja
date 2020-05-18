package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Budynki.*;
import RandomoweLiczby.GeneratorRandom;
import Towar.*;

public class TestBudynki {

	@Test
	public void testMennicaIlosc() {
		Towar towar1 = new Towar(5, 5);
		Mennica.PlusTowary(towar1);
		//Sprawdzanie czy Budynek dodaje odpowiednia ilosc towarow
		assertTrue(towar1.getJedzenie() >= 0 && towar1.getJedzenie() <= 8);
		assertTrue(towar1.getMaterialy() >= 0 && towar1.getMaterialy() <= 8);
		assertTrue(towar1.getNarzedzia() >= 0 && towar1.getNarzedzia() <= 8);
		assertTrue(towar1.getTowary() >= 0 && towar1.getTowary() <= 8);
		assertTrue(towar1.getUbrania() >= 0 && towar1.getUbrania() <= 8);
		assertTrue(towar1.getZloto() >= 0 && towar1.getZloto() <= 8);
	}
	
	@Test
	public void testWarsztatIlosc() {
		Towar towar1 = new Towar(5, 5);
		Warsztat.WymanazajTowary(towar1);
		//Sprawdzanie czy Budynek wymnaza w odpowiedni sposob
		assertTrue(towar1.getJedzenie() >= 0 && towar1.getJedzenie() <= 10);
		assertTrue(towar1.getMaterialy() >= 0 && towar1.getMaterialy() <= 10);
		assertTrue(towar1.getNarzedzia() >= 0 && towar1.getNarzedzia() <= 10);
		assertTrue(towar1.getTowary() >= 0 && towar1.getTowary() <= 10);
		assertTrue(towar1.getUbrania() >= 0 && towar1.getUbrania() <= 10);
		assertTrue(towar1.getZloto() >= 0 && towar1.getZloto() <= 10);
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
		Warsztat warsztat = new Warsztat(GeneratorRandom.RandomOd1(X), GeneratorRandom.RandomOd1(Y));
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
		Mennica mennica = new Mennica(GeneratorRandom.RandomOd1(X), GeneratorRandom.RandomOd1(Y));
		if(mennica.getXBudynek() >= 0 && mennica.getYBudynek() <= X) {
			if(mennica.getYBudynek() >= 0 && mennica.getYBudynek() <= Y) {
				return true;
			}
		}
		return false;
	}
	
}
