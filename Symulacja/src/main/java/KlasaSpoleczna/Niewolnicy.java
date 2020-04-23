package KlasaSpoleczna;

public class Niewolnicy extends KlasaSpoleczna {
	
	
	public Niewolnicy(int Xniewolnicy, int Yniewolnicy) {
		super(Xniewolnicy, Yniewolnicy);
	}
	
	public void Handel(KlasaSpoleczna klasa) {
		if(klasa.getXpolozenie() >= getXpolozenie()-1 && klasa.getXpolozenie() <= getXpolozenie()+1) 
			if(klasa.getYpolozenie() >= getYpolozenie()-1 && klasa.getYpolozenie() <= getYpolozenie()+1) { 
				System.out.println("Handlujemy");
				
				if(klasa instanceof Rzemieslnicy) {
					while(klasa.getJedzenie() != 0 && getNarzedzia() != 0) {
						klasa.setJedzenie(klasa.getJedzenie()-1);
						setJedzenie(getJedzenie()+1);
						klasa.setNarzedzia(getNarzedzia()+1);
						setNarzedzia(getNarzedzia()-1);
					}
					while(klasa.getUbrania() != 0 && getMaterialy() != 0) {
						klasa.setUbrania(klasa.getUbrania()-1);
						setUbrania(getUbrania()+1);
						klasa.setMaterialy(getMaterialy()+1);
						setMaterialy(getMaterialy()-1);
					}
				}
				if(klasa instanceof Arystokracja) {
					while(klasa.getJedzenie() != 0 && getZloto() != 0 ) {
						klasa.setJedzenie(klasa.getJedzenie()-1);
						setJedzenie(getJedzenie()+1);
						klasa.setZloto(getZloto()+1);
						setZloto(getZloto()-1);
					}
					while(klasa.getUbrania() != 0 && getTowary() != 0) {
						klasa.setUbrania(klasa.getUbrania()-1);
						setUbrania(getUbrania()+1);
						klasa.setTowary(getTowary()+1);
						setTowary(getTowary()-1);
					}
				}
					
			}
	}
	
	@Override
	public void ZbieranieTowarow() {
		
		
	}
	
	public static void main(String[] args) {
		KlasaSpoleczna niew = new Niewolnicy(3, 4);
		niew.setJedzenie(10);
		niew.setUbrania(5);
		niew.setNarzedzia(3);
		niew.setMaterialy(2);
		KlasaSpoleczna rzem = new Rzemieslnicy(4, 4);
		rzem.setNarzedzia(2);
		rzem.setMaterialy(2);
		rzem.setJedzenie(1);
		rzem.setUbrania(5);
		
		
		niew.Handel(rzem);
		System.out.println("Niewolnicy");
		System.out.println("Jedzenie: " + niew.getJedzenie());
		System.out.println("Ubrania: " + niew.getUbrania());
		System.out.println("Narzedzia: " + niew.getNarzedzia());
		System.out.println("Materialy: " + niew.getMaterialy());
		System.out.println("Arystokracja");
		System.out.println("Narzedzia: " + rzem.getNarzedzia());
		System.out.println("Materialy: " + rzem.getMaterialy());
		System.out.println("Jedzenie: " + rzem.getJedzenie());
		System.out.println("Ubrania: " + rzem.getUbrania());
	}
}