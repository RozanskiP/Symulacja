package Niebezpieczenstwo;

import RandomoweLiczby.GeneratorRandom;

//Klasa tworzaca niebezpieczenstwo ktore zabija Arystokracje
public class Bandyci implements Niebezpieczenstwo {
	
	//Konstruktor domyslny
	public Bandyci(){ }
	
	//Metoda przecia¿ona zmniejszajaca ilosc
	@Override
	public int ZmniejszIloscPopulacja() {
		int a  = GeneratorRandom.RandomOd1(2);
		return a;	
	}
}