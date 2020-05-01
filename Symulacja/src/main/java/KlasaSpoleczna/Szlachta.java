package KlasaSpoleczna;

import RandomoweLiczby.*;
import Zarzadzanie.Plansza;

public class Szlachta extends Arystokracja {
	
	//Konstruktor Szlachta tworzacy obiekt z wieksza liczba populacji
	// o 0.05 i dwoma ruchami
	public Szlachta(KlasaSpoleczna arystokrata) {
		//Przes³anie do konstruktora rodzica
		super(arystokrata.getXpolozenie(),arystokrata.getYpolozenie());
		setJedzenie(arystokrata.getJedzenie());
		setMaterialy(arystokrata.getMaterialy());
		setNarzedzia(arystokrata.getNarzedzia());
		setTowary(arystokrata.getTowary());
		setUbrania(arystokrata.getUbrania());
		setZloto(arystokrata.getZloto());
		//Dodatkowa Populacja
		setPopulacja((int)(arystokrata.getPopulacja()*1.05));
		setLicznikTowarow(arystokrata.getLicznikTowarow());
		setLicznikNiebezpieczenstw(arystokrata.getLicznikNiebezpieczenstw());
	}
	
	@Override
	public String toString() {
		return "Szlachta";
	}
	
	//Podwojny ruch Szlachcia
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
