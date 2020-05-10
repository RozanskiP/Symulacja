package KlasaSpoleczna;

//KlasaSpoleczna typu Niewolnicy
public class Niewolnicy extends KlasaSpoleczna {
	
	//Konstruktor klasy Niewolnicy
	public Niewolnicy(int Xniewolnicy, int Yniewolnicy) {
		super(Xniewolnicy, Yniewolnicy);
	}
	
	//Przeciazenie metody toString wyswietlajacej nazwe funkcji
	@Override
	public String toString() {
		return "Niewolnicy";
	}
	
	//Metoda sprawdzajaca i przeprowadzajaca handel z klasa podana jako argument
	public void Handel(KlasaSpoleczna klasa) {
		if(klasa.getXpolozenie() >= getXpolozenie()-1 && klasa.getXpolozenie() <= getXpolozenie()+1) 
			if(klasa.getYpolozenie() >= getYpolozenie()-1 && klasa.getYpolozenie() <= getYpolozenie()+1) { 
				//System.out.println("Handlujemy");
				
				if(klasa instanceof Rzemieslnicy || klasa instanceof Handlarze) {
					while(klasa.getJedzenie() != 0 && getNarzedzia() != 0) {
						klasa.setJedzenie(klasa.getJedzenie()-1);
						setJedzenie(getJedzenie()+1);
						klasa.setNarzedzia(klasa.getNarzedzia()+1);
						setNarzedzia(getNarzedzia()-1);
						if(klasa.getJedzenie() <= 0)
							break;
						if(klasa.getNarzedzia() <= 0)
							break;
						if(getJedzenie() <= 0)
							break;
						if(getNarzedzia() <= 0)
							break;
					}
					while(klasa.getUbrania() != 0 && getMaterialy() != 0) {
						klasa.setUbrania(klasa.getUbrania()-1);
						setUbrania(getUbrania()+1);
						klasa.setMaterialy(klasa.getMaterialy()+1);
						setMaterialy(getMaterialy()-1);
						if(klasa.getUbrania() <= 0)
							break;
						if(klasa.getMaterialy() <= 0)
							break;
						if(getUbrania() <= 0)
							break;
						if(getMaterialy() <= 0)
							break;
					}
				}
				if(klasa instanceof Arystokracja || klasa instanceof Szlachta) {
					while(klasa.getJedzenie() != 0 && getZloto() != 0 ) {
						klasa.setJedzenie(klasa.getJedzenie()-1);
						setJedzenie(getJedzenie()+1);
						klasa.setZloto(klasa.getZloto()+1);
						setZloto(getZloto()-1);
						if(klasa.getJedzenie() <= 0)
							break;
						if(klasa.getZloto() <= 0)
							break;
						if(getJedzenie() <= 0)
							break;
						if(getZloto() <= 0)
							break;
					}
					while(klasa.getUbrania() != 0 && getTowary() != 0) {
						klasa.setUbrania(klasa.getUbrania()-1);
						setUbrania(getUbrania()+1);
						klasa.setTowary(klasa.getTowary()+1);
						setTowary(getTowary()-1);
						if(klasa.getUbrania() <= 0)
							break;
						if(klasa.getTowary() <= 0)
							break;
						if(getUbrania() <= 0)
							break;
						if(getTowary() <= 0)
							break;
					}
				}
					
			}
	}
}