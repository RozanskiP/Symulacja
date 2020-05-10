package KlasaSpoleczna;

//KlasaSpoleczna typu Arystokracja
public class Arystokracja extends KlasaSpoleczna{
	
	//Konstruktor klasy Arystokracja
	public Arystokracja(int Xarystokracja, int Yarystokracja) {
		super(Xarystokracja, Yarystokracja);
	}
	
	//Przeciazenie metody toString wyswietlajacej nazwe funkcji
	@Override
	public String toString() {
		return "Arystokracja";
	}
	
	//Metoda sprawdzajaca i przeprowadzajaca handel z klasa podana jako argument
	public void Handel(KlasaSpoleczna klasa) {
		if(klasa.getXpolozenie() >= getXpolozenie()-1 && klasa.getXpolozenie() <= getXpolozenie()+1) 
			if(klasa.getYpolozenie() >= getYpolozenie()-1 && klasa.getYpolozenie() <= getYpolozenie()+1) { 
				if(klasa instanceof Niewolnicy || klasa instanceof Mieszczanie) {
					while(klasa.getZloto() != 0 && getJedzenie() != 0) {
						klasa.setJedzenie(klasa.getJedzenie()+1);
						setJedzenie(getJedzenie()-1);
						klasa.setZloto(klasa.getZloto()-1);
						setZloto(getZloto()+1);
						if(klasa.getZloto() <= 0)
							break;
						if(klasa.getJedzenie() <= 0)
							break;
						if(getZloto() <= 0)
							break;
						if(getJedzenie() <= 0)
							break;
					}
					while(klasa.getTowary() != 0 && getUbrania() != 0) {
						klasa.setUbrania(klasa.getUbrania()+1);
						setUbrania(getUbrania()-1);
						klasa.setTowary(klasa.getTowary()-1);
						setTowary(getTowary()+1);
						if(klasa.getTowary() <= 0)
							break;
						if(klasa.getUbrania() <= 0)
							break;
						if(getTowary() <= 0)
							break;
						if(getUbrania() <= 0)
							break;
					}
				}
				if(klasa instanceof Rzemieslnicy || klasa instanceof Handlarze) {
					while(klasa.getZloto() != 0 && getNarzedzia() != 0) {
						klasa.setNarzedzia(klasa.getNarzedzia()+1);
						setNarzedzia(getNarzedzia()-1);
						klasa.setZloto(klasa.getZloto()-1);
						setZloto(getZloto()+1);
						if(klasa.getZloto() <= 0)
							break;
						if(klasa.getNarzedzia() <= 0)
							break;
						if(getZloto() <= 0)
							break;
						if(getNarzedzia() <= 0)
							break;
					}
					while(klasa.getTowary() != 0 && getMaterialy() != 0) {
						klasa.setMaterialy(klasa.getMaterialy()+1);
						setMaterialy(getMaterialy()-1);
						klasa.setTowary(klasa.getTowary()-1);
						setTowary(getTowary()+1);
						if(klasa.getTowary() <= 0)
							break;
						if(klasa.getMaterialy() <= 0)
							break;
						if(getTowary() <= 0)
							break;
						if(getMaterialy() <= 0)
							break;
					}
				}
			}
	}
}
