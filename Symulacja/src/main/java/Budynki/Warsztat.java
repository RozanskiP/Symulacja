package Budynki;

import KlasaSpoleczna.*;

public class Warsztat extends Budynek{
	private static int DodatkoweTowaryWymnoz = 2;
	
	public Warsztat(int X, int Y) {
		super(X,Y);
	}
	
	public void WymanazajTowary(KlasaSpoleczna klasa) {
		klasa.getJedzenie()
	}
}
