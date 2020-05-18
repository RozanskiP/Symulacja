package Tests;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

import KlasaSpoleczna.*;
import Niebezpieczenstwo.Bandyci;
import Niebezpieczenstwo.DzikieZwierzeta;
import Niebezpieczenstwo.GenerujNiebezpieczenstwo;
import Niebezpieczenstwo.Niebezpieczenstwo;
import Niebezpieczenstwo.Zlodzieje;
import Towar.*;
import Zarzadzanie.*;
import Budynki.*;

public class TestZarzadzanie {
	
	@Test
	public void testZapisOdczyt() throws IOException  {
		ZapisOdczyt zapodc = new ZapisOdczyt();
		Main.main();
		zapodc.Odczyt();
		
		assertTrue(zapodc.getWielkoscPlanszyX() > 0);
		assertTrue(zapodc.getWielkoscPlanszyY() > 0);
		assertTrue(ZapisOdczyt.getNiewolnicySzansa() >= 0);
		assertTrue(ZapisOdczyt.getRzemieslnicySzansa() >= 0);
		assertTrue(ZapisOdczyt.getArystokracjaWiekszaPopulacja() >= 0);
		assertTrue(ZapisOdczyt.getPopulacjaStartowaArystokracja() > 0);
		assertTrue(ZapisOdczyt.getPopulacjaStartowaNiewolnicy() > 0);
		assertTrue(ZapisOdczyt.getPopulacjaStartowaRzemieslnicy() > 0);
		assertTrue(ZapisOdczyt.getPOPULACJAMAX() > 0);
		
		zapodc.Zapis();
		
		assertTrue(zapodc.getWygranaKlasa() instanceof KlasaSpoleczna);
		assertTrue(zapodc.getMiejsce2() instanceof KlasaSpoleczna);
		assertTrue(zapodc.getMiejsce3() instanceof KlasaSpoleczna);
		assertTrue(zapodc.getWygranaKlasaPopulacja() >= ZapisOdczyt.getPOPULACJAMAX());
		assertTrue(zapodc.getMiejsce2Populacja() >= 0);
		assertTrue(zapodc.getMiejsce3Populacja() >= 0);
	}
	
	
	//Test prawid³owego ruchu poszczegolnych Klas
	@Test
	public void testRuchu() {
		Plansza plansza = new Plansza(20, 20);
		Tura tura = new Tura();
		KlasaSpoleczna niew = new Niewolnicy(5,5);
		KlasaSpoleczna rzem = new Rzemieslnicy(5,5);
		KlasaSpoleczna arys = new Arystokracja(5,5);
		Plansza.setNiewolnikNaPlanszy(niew);
		Plansza.setRzemieslnikNaPlanszy(rzem);
		Plansza.setArystokrataNaPlanszy(arys);
		
		tura.RuchyKlas();
		
		assertTrue(niew.getXpolozenie() >= 4 && niew.getXpolozenie() <= 6);
		assertTrue(niew.getYpolozenie() >= 4 && niew.getYpolozenie() <= 6);
		assertTrue(rzem.getXpolozenie() >= 4 && rzem.getXpolozenie() <= 6);
		assertTrue(rzem.getYpolozenie() >= 4 && rzem.getYpolozenie() <= 6);
		assertTrue(arys.getXpolozenie() >= 4 && arys.getXpolozenie() <= 6);
		assertTrue(arys.getYpolozenie() >= 4 && arys.getYpolozenie() <= 6);
	}
	
	
	//Test poprawnosci odjecia atrybutów od KlasSpolecznych
	@Test
	public void testZabojstwa() {
		Plansza plansza = new Plansza(20, 20);
		Tura tura = new Tura();
		KlasaSpoleczna niew = new Niewolnicy(5, 5);
		niew.setJedzenie(5);
		niew.setUbrania(5);
		KlasaSpoleczna rzem = new Rzemieslnicy(7, 7);
		rzem.setMaterialy(3);
		rzem.setNarzedzia(3);
		KlasaSpoleczna arys = new Arystokracja(9, 9);
		arys.setTowary(7);
		arys.setZloto(7);
		Plansza.setNiewolnikNaPlanszy(niew);
		Plansza.setRzemieslnikNaPlanszy(rzem);
		Plansza.setArystokrataNaPlanszy(arys);
		
		GenerujNiebezpieczenstwo nieb1 = new GenerujNiebezpieczenstwo(5, 5);
		Niebezpieczenstwo dzikiezwierzeta = new DzikieZwierzeta();
		nieb1.setZabojca(dzikiezwierzeta);
		int lic1 = dzikiezwierzeta.ZmniejszIloscPopulacja();
		Plansza.setNiebezpieczenstwoNaPlanszy(nieb1);
		
		GenerujNiebezpieczenstwo nieb2 = new GenerujNiebezpieczenstwo(7, 7);
		Niebezpieczenstwo bandyta = new Bandyci();
		nieb2.setZabojca(bandyta);
		int lic2 = bandyta.ZmniejszIloscPopulacja();
		Plansza.setNiebezpieczenstwoNaPlanszy(nieb2);
		
		GenerujNiebezpieczenstwo nieb3 = new GenerujNiebezpieczenstwo(9, 9);
		Niebezpieczenstwo zlodzieje = new Zlodzieje();
		nieb3.setZabojca(zlodzieje);
		int lic3 = zlodzieje.ZmniejszIloscPopulacja();
		Plansza.setNiebezpieczenstwoNaPlanszy(nieb3);
		
		tura.Zabojstwa();
		
		
		assertTrue(niew.getJedzenie() >= 3);
		assertTrue(rzem.getMaterialy() >= 1);
		assertTrue(arys.getTowary() >= 5);
		assertTrue(niew.getUbrania() >= 3);
		assertTrue(rzem.getNarzedzia() >= 1);
		assertTrue(arys.getZloto() >= 5);
		
	}
	
	//Test poprawnej aktualizacji populacji Klas
	@Test
	public void testAktualizacjaPopulacjiKlas() {
		Plansza plansza = new Plansza(20, 20);
		Tura tura = new Tura();
		KlasaSpoleczna niew = new Niewolnicy(5, 5);
		niew.setJedzenie(5);
		niew.setUbrania(5);
		KlasaSpoleczna rzem = new Rzemieslnicy(7, 7);
		rzem.setMaterialy(3);
		rzem.setNarzedzia(3);
		KlasaSpoleczna arys = new Arystokracja(9, 9);
		arys.setTowary(7);
		arys.setZloto(7);
		Plansza.setNiewolnikNaPlanszy(niew);
		Plansza.setRzemieslnikNaPlanszy(rzem);
		Plansza.setArystokrataNaPlanszy(arys);
		
		tura.AktualizacjaPopulacjiKlas();
		
		assertTrue(niew.getPopulacja() == 5);
		assertTrue(rzem.getPopulacja() == 3);
		assertTrue(arys.getPopulacja() == 7);
		assertFalse(niew.getPopulacja() == 4);
		assertFalse(rzem.getPopulacja() == 2);
		assertFalse(arys.getPopulacja() == 6);
	}
	
	
	//Test poprawnego zbierania przez Klasy
	@Test
	public void testZbierzTowaryKlas() {
		Plansza plansza = new Plansza(20, 20);
		Tura tura = new Tura();
		KlasaSpoleczna niew = new Niewolnicy(5, 5);
		niew.setJedzenie(0);
		niew.setMaterialy(0);
		niew.setNarzedzia(0);
		niew.setTowary(0);
		niew.setUbrania(0);
		niew.setZloto(0);
		KlasaSpoleczna rzem = new Rzemieslnicy(7, 7);
		rzem.setJedzenie(0);
		rzem.setMaterialy(0);
		rzem.setNarzedzia(0);
		rzem.setTowary(0);
		rzem.setUbrania(0);
		rzem.setZloto(0);
		KlasaSpoleczna arys = new Arystokracja(9, 9);
		rzem.setJedzenie(0);
		rzem.setMaterialy(0);
		rzem.setNarzedzia(0);
		rzem.setTowary(0);
		rzem.setUbrania(0);
		rzem.setZloto(0);
		Plansza.setNiewolnikNaPlanszy(niew);
		Plansza.setRzemieslnikNaPlanszy(rzem);
		Plansza.setArystokrataNaPlanszy(arys);
		
		Towar towar1 = new Towar(5, 5);
		towar1.setJedzenie(5);
		towar1.setMaterialy(5);
		towar1.setNarzedzia(5);
		towar1.setTowary(5);
		towar1.setUbrania(5);
		towar1.setZloto(5);
		Towar towar2 = new Towar(7, 7);
		towar2.setJedzenie(3);
		towar2.setMaterialy(3);
		towar2.setNarzedzia(3);
		towar2.setTowary(3);
		towar2.setUbrania(3);
		towar2.setZloto(3);
		Towar towar3 = new Towar(9, 9);
		towar3.setJedzenie(2);
		towar3.setMaterialy(2);
		towar3.setNarzedzia(2);
		towar3.setTowary(2);
		towar3.setUbrania(2);
		towar3.setZloto(2);
		Plansza.setTowarNaPlanszy(towar1);
		Plansza.setTowarNaPlanszy(towar2);
		Plansza.setTowarNaPlanszy(towar3);
		
		tura.ZbierzTowaryKlas();
		
		assertTrue(niew.getJedzenie() == 5);
		assertTrue(niew.getUbrania() == 5);
		assertTrue(niew.getNarzedzia() == 5);
		assertTrue(niew.getMaterialy() == 5);
		assertTrue(niew.getTowary() == 5);
		assertTrue(niew.getZloto() == 5);
		
		assertTrue(rzem.getJedzenie() == 3);
		assertTrue(rzem.getUbrania() == 3);
		assertTrue(rzem.getNarzedzia() == 3);
		assertTrue(rzem.getMaterialy() == 3);
		assertTrue(rzem.getTowary() == 3);
		assertTrue(rzem.getZloto() == 3);
		
		assertTrue(arys.getJedzenie() == 2);
		assertTrue(arys.getUbrania() == 2);
		assertTrue(arys.getNarzedzia() == 2);
		assertTrue(arys.getMaterialy() == 2);
		assertTrue(arys.getTowary() == 2);
		assertTrue(arys.getZloto() == 2);
	}
	
	
	//Test prawid³owej wymiany Handlowej
	@Test
	public void testTuraHandel() throws IOException {
		Plansza plansza = new Plansza(20, 20);
		Tura tura = new Tura();
		
		KlasaSpoleczna niew = new Niewolnicy(5,5);
		niew.setJedzenie(10);
		niew.setMaterialy(10);
		niew.setNarzedzia(10);
		niew.setTowary(10);
		niew.setUbrania(10);
		niew.setZloto(10);
		
		KlasaSpoleczna rzem = new Rzemieslnicy(5,5);
		rzem.setJedzenie(10);
		rzem.setMaterialy(10);
		rzem.setNarzedzia(10);
		rzem.setTowary(10);
		rzem.setUbrania(10);
		rzem.setZloto(10);
		
		KlasaSpoleczna arys = new Arystokracja(5,5);
		arys.setJedzenie(10);
		arys.setMaterialy(10);
		arys.setNarzedzia(10);
		arys.setTowary(10);
		arys.setUbrania(10);
		arys.setZloto(10);
		
		Plansza.setNiewolnikNaPlanszy(niew);
		Plansza.setRzemieslnikNaPlanszy(rzem);
		Plansza.setArystokrataNaPlanszy(arys);
		
		tura.HandelKlas();
		
		assertTrue(niew.getJedzenie() == 30);
		assertTrue(niew.getUbrania() == 30);
		assertTrue(niew.getNarzedzia() == 0);
		assertTrue(niew.getMaterialy() == 0);
		assertTrue(niew.getTowary() == 0);
		assertTrue(niew.getZloto() == 0);
		
		assertTrue(rzem.getJedzenie() == 0);
		assertTrue(rzem.getUbrania() == 0);
		assertTrue(rzem.getNarzedzia() == 30);
		assertTrue(rzem.getMaterialy() == 30);
		assertTrue(rzem.getTowary() == 0);
		assertTrue(rzem.getZloto() == 0);
		
		assertTrue(arys.getJedzenie() == 0);
		assertTrue(arys.getUbrania() == 0);
		assertTrue(arys.getNarzedzia() == 0);
		assertTrue(arys.getMaterialy() == 0);
		assertTrue(arys.getTowary() == 30);
		assertTrue(arys.getZloto() == 30);
	}
	
	//Test odpowiednich obiektow z Classie Plansza
	@Test
	public void testPlansza() {
		Plansza plansza = new Plansza(5, 5);
		assertTrue(Plansza.getXplanszy() == 5);
		assertTrue(Plansza.getYplanszy() == 5);
		assertTrue(Plansza.getWarsztatNaPlanszy() instanceof Warsztat);
		assertTrue(Plansza.getMennicaNaPlanszy() instanceof Mennica);
		assertTrue(Plansza.getNiewolnikNaPLanszy() instanceof Niewolnicy);
		assertTrue(Plansza.getRzemieslnikNaPlanszy() instanceof Rzemieslnicy);
		assertTrue(Plansza.getArystokrataNaPlanszy() instanceof Arystokracja);
	}
}
