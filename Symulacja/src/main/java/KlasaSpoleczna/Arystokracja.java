package KlasaSpoleczna;

import Towar.*;

public class Arystokracja extends KlasaSpoleczna{
	
	
	public Arystokracja(int Xarystokracja, int Yarystokracja) {
		super(Xarystokracja, Yarystokracja);
	}
	
	public void Handel(KlasaSpoleczna klasa) {
		if(klasa.getXpolozenie() >= getXpolozenie()-1 && klasa.getXpolozenie() <= getXpolozenie()+1) 
			if(klasa.getYpolozenie() >= getYpolozenie()-1 && klasa.getYpolozenie() <= getYpolozenie()+1) { 
				System.out.println("Handlujemy");
				if(klasa instanceof Niewolnicy) {
					while(klasa.getZloto() != 0 && getJedzenie() != 0) {
						klasa.setJedzenie(klasa.getJedzenie()+1);
						setJedzenie(getJedzenie()-1);
						klasa.setZloto(getZloto()-1);
						setZloto(getZloto()+1);
					}
					while(klasa.getTowary() != 0 && getUbrania() != 0) {
						klasa.setUbrania(klasa.getUbrania()+1);
						setUbrania(getUbrania()-1);
						klasa.setTowary(getTowary()-1);
						setTowary(getTowary()+1);
					}
				}
				if(klasa instanceof Rzemieslnicy) {
					while(klasa.getZloto() != 0 && getNarzedzia() != 0) {
						klasa.setNarzedzia(klasa.getNarzedzia()-1);
						setNarzedzia(getNarzedzia()+1);
						klasa.setZloto(getZloto()-1);
						setZloto(getZloto()+1);
					}
					while(klasa.getTowary() != 0 && getMaterialy() != 0) {
						klasa.setMaterialy(klasa.getMaterialy()-1);
						setMaterialy(getMaterialy()+1);
						klasa.setTowary(getTowary()-1);
						setTowary(getTowary()+1);
					}
				}
			}
	}
	
	public void ZbieranieTowarow(Towar towar) {
		setJedzenie(towar.getJedzenie());
		setUbrania(towar.getUbrania());
		setNarzedzia(towar.getJedzenie());
		setMaterialy(towar.getMaterialy());
		setTowary(towar.getTowary());
		setZloto(towar.getZloto());
	}
}
