package Niebezpieczenstwo;

import KlasaSpoleczna.*;
import RandomoweLiczby.GeneratorRandom;

public class Zlodzieje implements Niebezpieczenstwo {

	public Zlodzieje() {
		//System.out.println("Utworzona Zlodzieja");
	}
	
	@Override
	public int ZmniejszIloscPopulacja(KlasaSpoleczna klspol) {
		if(klspol instanceof Arystokracja) {
			if(GenerujNiebezpieczenstwo.getXniebezpieczenstwo()-1 <= klspol.getXpolozenie() && GenerujNiebezpieczenstwo.getXniebezpieczenstwo()+1 >= klspol.getXpolozenie()) {
				if(GenerujNiebezpieczenstwo.getYniebezpieczenstwo()-1 <= klspol.getYpolozenie() && GenerujNiebezpieczenstwo.getYniebezpieczenstwo()+1 >= klspol.getYpolozenie()) {
					int a = 0; // GeneratorRandom.RandomOd1(2);
					return a;
				}
			}
		}
		return 0;
	}
}
