package Niebezpieczenstwo;

import RandomoweLiczby.GeneratorRandom;

//Klasa tworzaca niebezpieczenstwo ktore zabija Rzemieslnikow
public class Zlodzieje implements Niebezpieczenstwo {

	//Konstruktor domyslny
	public Zlodzieje() { }
	
	//Metoda przeciażona zmniejszajaca ilosc
	@Override
	public int ZmniejszIloscPopulacja() {
		int a  = GeneratorRandom.RandomOd1(2);
		return a;
	}
}
