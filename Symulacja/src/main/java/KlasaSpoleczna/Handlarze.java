package KlasaSpoleczna;

import RandomoweLiczby.*;
import Zarzadzanie.Plansza;

public class Handlarze extends Rzemieslnicy {
	
	//Konstruktor Handlarze tworzacy obiekt z wieksza liczba populacji
	// o 0.05 i dwoma ruchami
	public Handlarze(KlasaSpoleczna rzemieslnik) {
		//Przes³anie do konstruktora rodzica
		super(rzemieslnik.getXpolozenie(),rzemieslnik.getYpolozenie());
		setJedzenie(rzemieslnik.getJedzenie());
		setMaterialy(rzemieslnik.getMaterialy());
		setNarzedzia(rzemieslnik.getNarzedzia());
		setTowary(rzemieslnik.getTowary());
		setUbrania(rzemieslnik.getUbrania());
		setZloto(rzemieslnik.getZloto());
		//Dodatkowa Populacja
		setPopulacja((int)(rzemieslnik.getPopulacja()*1.05));
		setLicznikTowarow(rzemieslnik.getLicznikTowarow());
		setLicznikNiebezpieczenstw(rzemieslnik.getLicznikNiebezpieczenstw());
	}
	
	@Override
	public String toString() {
		return "Handlarze";
	}
	
	//Podwojny ruch Handlarza
	@Override
	public void Ruch() {
		int a = getXpolozenie();
		int b = getYpolozenie();
		//pierwszy ruch
		do {
			a = a + GeneratorRandom.RandomOd0(3)-1;
		}while(!(a >= 1 && a <= Plansza.getXplanszy()));
		
		do {
			b = b + GeneratorRandom.RandomOd0(3)-1;
		}while(!(b >= 1 && b <= Plansza.getYplanszy()));
		//drugi ruch
		do {
			a = a + GeneratorRandom.RandomOd0(3)-1;
		}while(!(a >= 1 && a <= Plansza.getXplanszy()));
		
		do {
			b = b + GeneratorRandom.RandomOd0(3)-1;
		}while(!(b >= 1 && b <= Plansza.getYplanszy()));
		
		setXpolozenie(a);
		setYpolozenie(b);
	}
}
