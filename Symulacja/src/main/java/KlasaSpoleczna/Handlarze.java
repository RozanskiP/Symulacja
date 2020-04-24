package KlasaSpoleczna;

import RandomoweLiczby.*;

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
	}
	
	//Podwojny ruch Handlarza
	@Override
	public void Ruch() {
		//Pierwszy ruch
		setXpolozenie(GeneratorRandom.RandomOd0(2)-1);
		setYpolozenie(GeneratorRandom.RandomOd0(2)-1);
		//Drugi ruch
		setXpolozenie(GeneratorRandom.RandomOd0(2)-1);
		setYpolozenie(GeneratorRandom.RandomOd0(2)-1);	
	}
}
