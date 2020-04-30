package Niebezpieczenstwo;

import RandomoweLiczby.GeneratorRandom;

public class Bandyci implements Niebezpieczenstwo {
	
	public Bandyci(){
		//System.out.println("Utworzona Bandyte");
	}
	
	@Override
	public int ZmniejszIloscPopulacja() {
		
		int a  = GeneratorRandom.RandomOd1(2);
		return a;	
	}
}