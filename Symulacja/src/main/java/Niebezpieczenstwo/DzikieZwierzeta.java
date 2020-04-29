package Niebezpieczenstwo;

import KlasaSpoleczna.*;
import RandomoweLiczby.GeneratorRandom;

public class DzikieZwierzeta implements Niebezpieczenstwo {
	
	public DzikieZwierzeta() {
		System.out.println("Utworzona DzikieZwierzeta");
	}
	
	@Override
	public int ZmniejszIloscPopulacja(KlasaSpoleczna klspol) {
		if(klspol instanceof Niewolnicy) {
			if(GenerujNiebezpieczenstwo.getXniebezpieczenstwo()-1 <= klspol.getXpolozenie() && GenerujNiebezpieczenstwo.getXniebezpieczenstwo()+1 >= klspol.getXpolozenie()) {
				if(GenerujNiebezpieczenstwo.getYniebezpieczenstwo()-1 <= klspol.getYpolozenie() && GenerujNiebezpieczenstwo.getYniebezpieczenstwo()+1 >= klspol.getYpolozenie()) {
					int a = GeneratorRandom.RandomOd1(2);
					return a;
				}
			}
		}
		return 0;
	}
}
