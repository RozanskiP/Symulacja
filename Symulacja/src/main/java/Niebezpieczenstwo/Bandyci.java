package Niebezpieczenstwo;

import KlasaSpoleczna.*;
import RandomoweLiczby.GeneratorRandom;

public class Bandyci implements Niebezpieczenstwo {
	
	public Bandyci(){
		//System.out.println("Utworzona Bandyte");
	}
	
	@Override
	public int ZmniejszIloscPopulacja(KlasaSpoleczna klspol) {
		if(klspol instanceof Rzemieslnicy) {
			if(GenerujNiebezpieczenstwo.getXniebezpieczenstwo()-1 <= klspol.getXpolozenie() && GenerujNiebezpieczenstwo.getXniebezpieczenstwo()+1 >= klspol.getXpolozenie()) {
				if(GenerujNiebezpieczenstwo.getYniebezpieczenstwo()-1 <= klspol.getYpolozenie() && GenerujNiebezpieczenstwo.getYniebezpieczenstwo()+1 >= klspol.getYpolozenie()) {
					int a  = GeneratorRandom.RandomOd1(2);
					return a;
				}
			}
		}
		return 0;
	}
}
