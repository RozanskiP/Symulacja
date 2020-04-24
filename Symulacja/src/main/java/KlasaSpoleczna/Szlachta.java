package KlasaSpoleczna;

import RandomoweLiczby.*;

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
	}
	
	//Podwojny ruch Szlachcia
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
