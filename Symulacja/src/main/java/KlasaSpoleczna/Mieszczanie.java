package KlasaSpoleczna;

import RandomoweLiczby.*;
import Zarzadzanie.Plansza;

public class Mieszczanie extends Niewolnicy {
	
	//Konstruktor Mieszczanie tworzacy obiekt z wieksza liczba populacji
	// o 0.05 i dwoma ruchami
	public Mieszczanie(KlasaSpoleczna niewolnik) {
		//Przes³anie do konstruktora rodzica
		super(niewolnik.getXpolozenie(),niewolnik.getYpolozenie());
		setJedzenie(niewolnik.getJedzenie());
		setMaterialy(niewolnik.getMaterialy());
		setNarzedzia(niewolnik.getNarzedzia());
		setTowary(niewolnik.getTowary());
		setUbrania(niewolnik.getUbrania());
		setZloto(niewolnik.getZloto());
		//Dodatkowa Populacja
		setPopulacja((int) (niewolnik.getPopulacja()*1.05));
	}
	
	@Override
	public String toString() {
		return "Mieszczanie";
	}
	
	//Podwojny ruch Mieszcznina
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
