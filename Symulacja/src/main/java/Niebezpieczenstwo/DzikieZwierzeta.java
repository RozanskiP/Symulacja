package Niebezpieczenstwo;

import RandomoweLiczby.GeneratorRandom;

public class DzikieZwierzeta implements Niebezpieczenstwo {
	
	public DzikieZwierzeta() {
		System.out.println("Utworzona DzikieZwierzeta");
	}
	
	@Override
	public int ZmniejszIloscPopulacja() {
		int a = GeneratorRandom.RandomOd1(2);
		return a;
	}
}
