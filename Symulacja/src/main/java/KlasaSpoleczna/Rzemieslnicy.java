package KlasaSpoleczna;

public class Rzemieslnicy extends KlasaSpoleczna {
	
	
	public Rzemieslnicy(int Xrzemieslnicy, int Yrzemieslnicy) {
		super(Xrzemieslnicy, Yrzemieslnicy);
	}
	
	@Override
	public String toString() {
		return "Rzemieslnicy";
	}
	
	public void Handel(KlasaSpoleczna klasa) {
		if(klasa.getXpolozenie() >= getXpolozenie()-1 && klasa.getXpolozenie() <= getXpolozenie()+1) 
			if(klasa.getYpolozenie() >= getYpolozenie()-1 && klasa.getYpolozenie() <= getYpolozenie()+1) { 
				//System.out.println("Handlujemy");
				
				if(klasa instanceof Niewolnicy || klasa instanceof Mieszczanie) {
					System.out.println("3                                  HANDEL");
					while(klasa.getNarzedzia() != 0 && getJedzenie() != 0) {
						klasa.setJedzenie(klasa.getJedzenie()+1);
						setJedzenie(getJedzenie()-1);
						klasa.setNarzedzia(klasa.getNarzedzia()-1);
						setNarzedzia(getNarzedzia()+1);
						if(klasa.getNarzedzia() <= 0)
							break;
						if(klasa.getJedzenie() <= 0)
							break;
						if(getNarzedzia() <= 0)
							break;
						if(getJedzenie() <= 0)
							break;
					}
					while(klasa.getMaterialy() != 0 && getUbrania() != 0) {
						klasa.setUbrania(klasa.getUbrania()+1);
						setUbrania(getUbrania()-1);
						klasa.setMaterialy(klasa.getMaterialy()-1);
						setMaterialy(getMaterialy()+1);
						if(klasa.getMaterialy() <= 0)
							break;
						if(klasa.getUbrania() <= 0)
							break;
						if(getMaterialy() <= 0)
							break;
						if(getUbrania() <= 0)
							break;
					}
				}
				if(klasa instanceof Arystokracja || klasa instanceof Szlachta) {
					System.out.println("4                                 HANDEL");
					while(klasa.getNarzedzia() != 0 && getZloto() != 0 ) {
						klasa.setNarzedzia(klasa.getNarzedzia()-1);
						setNarzedzia(getNarzedzia()+1);
						klasa.setZloto(klasa.getZloto()+1);
						setZloto(getZloto()-1);
						if(klasa.getNarzedzia() <= 0)
							break;
						if(klasa.getZloto() <= 0)
							break;
						if(getNarzedzia() <= 0)
							break;
						if(getZloto() <= 0)
							break;
					}
					while(klasa.getMaterialy() != 0 && getTowary() != 0) {
						klasa.setMaterialy(klasa.getMaterialy()-1);
						setMaterialy(getMaterialy()+1);
						klasa.setTowary(klasa.getTowary()+1);
						setTowary(getTowary()-1);
						if(klasa.getMaterialy() <= 0)
							break;
						if(klasa.getTowary() <= 0)
							break;
						if(getMaterialy() <= 0)
							break;
						if(getTowary() <= 0)
							break;
					}
				}
					
			}
	}
}