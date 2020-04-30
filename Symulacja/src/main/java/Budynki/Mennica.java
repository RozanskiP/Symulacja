package Budynki;

import Towar.*;

public class Mennica extends Budynek {
	//Sta³a ktora bedzie dodawana do towarow w zasiegu Mennicy
	private final static int DodatkoweTowaryPlus = 3;
	
	//Konstruktor ktory tworzy obiekt nadajac mu polozenie na planszy
	public Mennica(int X, int Y) {
		super(X,Y);
		//System.out.println("Stworzona Mennice");
	}
	
	//Metoda ktora dodaje dodatkowe towary do nich je¿eli znajduja sie w zasiegu Mennicy
	//<zrobic testy>
	public static void PlusTowary(Towar towar) {
		if(towar.getXtowar() >= getXBudynek()-2 && towar.getXtowar() <= getXBudynek()+2)
			if(towar.getYtowar() >= getYBudynek()-2 && towar.getYtowar() <= getYBudynek()+2) {
				if(towar.getJedzenie() < 6 && towar.getMaterialy() < 6 && towar.getNarzedzia() < 6 && towar.getTowary() < 6 && towar.getUbrania() < 6 && towar.getZloto() < 6) {
					towar.setJedzenie(towar.getJedzenie()+DodatkoweTowaryPlus);
					towar.setMaterialy(towar.getMaterialy()+DodatkoweTowaryPlus);
					towar.setNarzedzia(towar.getNarzedzia()+DodatkoweTowaryPlus);
					towar.setTowary(towar.getTowary()+DodatkoweTowaryPlus);
					towar.setUbrania(towar.getUbrania()+DodatkoweTowaryPlus);
					towar.setZloto(towar.getZloto()+DodatkoweTowaryPlus);
				}
			}
	}
	/*
	public static void main(String[] args) {
		Towar towar = new Towar(4, 4);
		//System.out.println(towar.getJedzenie());
		Mennica warsztat = new Mennica(5, 5);
		warsztat.PlusTowary(towar);
		//System.out.println(towar.getJedzenie());
	}
	*/
}
