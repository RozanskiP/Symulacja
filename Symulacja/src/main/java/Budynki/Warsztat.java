package Budynki;

import Towar.*;

public class Warsztat extends Budynek{
	//Stala przez ktora bêd¹ mnozone towary w zasiegu Warsztatu
	private final static int DodatkoweTowaryWymnoz = 2;
	
	//Konstruktor ktory tworzy obiekt nadajac mu polozenie na planszy
	public Warsztat(int X, int Y) {
		super(X,Y);
		//System.out.println("Stworzona Warsztat");
	}
	
	//Metoda ktora wymnaza towar ktory znajduje sie w zasiegu Warsztatu
	//<zrobic testy>
	public static void WymanazajTowary(Towar towar) {
		if(towar.getXtowar() >= getXBudynek()-2 && towar.getXtowar() <= getXBudynek()+2)
			if(towar.getYtowar() >= getYBudynek()-2 && towar.getYtowar() <= getYBudynek()+2) {
				towar.setJedzenie(towar.getJedzenie()*DodatkoweTowaryWymnoz);
				towar.setMaterialy(towar.getMaterialy()*DodatkoweTowaryWymnoz);
				towar.setNarzedzia(towar.getNarzedzia()*DodatkoweTowaryWymnoz);
				towar.setTowary(towar.getTowary()*DodatkoweTowaryWymnoz);
				towar.setZloto(towar.getZloto()*DodatkoweTowaryWymnoz);
				towar.setUbrania(towar.getUbrania()*DodatkoweTowaryWymnoz);
			}
	}
}
