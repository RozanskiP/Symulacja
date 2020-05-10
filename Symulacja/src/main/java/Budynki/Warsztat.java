package Budynki;

import Towar.*;

//Budynek typu Warsztat która wymna¿a towary które znajduj¹ sie w jej zasiegu
public class Warsztat extends Budynek{
	//Stala przez ktora bêd¹ mnozone towary w zasiegu Warsztatu
	private final static int DodatkoweTowaryWymnoz = 2;
	
	//Konstruktor ktory tworzy obiekt nadajac mu polozenie na planszy
	public Warsztat(int X, int Y) {
		super(X,Y);
		//System.out.println("Stworzona Warsztat");
	}
	
	//Metoda ktora wymnaza towar ktory znajduje sie w zasiegu Warsztatu
	public static void WymanazajTowary(Towar towar) {
		if(towar.getXtowar() >= Budynek.XBudynek-2 && towar.getXtowar() <= Budynek.XBudynek+2)
			if(towar.getYtowar() >= Budynek.YBudynek-2 && towar.getYtowar() <= Budynek.YBudynek+2) {
				if(towar.getJedzenie() < 6 && towar.getMaterialy() < 6 && towar.getNarzedzia() < 6 && towar.getTowary() < 6 && towar.getUbrania() < 6 && towar.getZloto() < 6) {
					towar.setJedzenie(towar.getJedzenie()*DodatkoweTowaryWymnoz);
					towar.setMaterialy(towar.getMaterialy()*DodatkoweTowaryWymnoz);
					towar.setNarzedzia(towar.getNarzedzia()*DodatkoweTowaryWymnoz);
					towar.setTowary(towar.getTowary()*DodatkoweTowaryWymnoz);
					towar.setUbrania(towar.getUbrania()*DodatkoweTowaryWymnoz);
					towar.setZloto(towar.getZloto()*DodatkoweTowaryWymnoz);
				}
			}
	}
}

