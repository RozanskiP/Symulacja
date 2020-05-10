package Niebezpieczenstwo;


import RandomoweLiczby.GeneratorRandom;

//Klasa tworzaca niebezpieczenstwo ktore zabija Niewolnika
public class DzikieZwierzeta implements Niebezpieczenstwo {
	
	//Konstruktor domyslny
	public DzikieZwierzeta() { }
	
	//Metoda przecia¿ona zmniejszajaca ilosc
	@Override
	public int ZmniejszIloscPopulacja() {
		int a  = GeneratorRandom.RandomOd1(2);
		return a;
	}
}
