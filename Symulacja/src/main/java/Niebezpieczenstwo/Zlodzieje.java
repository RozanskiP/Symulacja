package Niebezpieczenstwo;

import RandomoweLiczby.GeneratorRandom;

public class Zlodzieje implements Niebezpieczenstwo {

	public Zlodzieje() {
		System.out.println("Utworzona Zlodzieja");
	}
	
	@Override
	public int ZmniejszIloscPopulacja() {
		int a = GeneratorRandom.RandomOd1(2);
		return a;
	}
}
