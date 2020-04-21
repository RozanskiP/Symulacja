package KlasaSpoleczna;

public class Niewolnicy extends KlasaSpoleczna {
	private int Ubrania;
	private int Jedzenie;
	private int NiewolnicyNarzedzia;
	private int NiewolnicyMaterialy;
	private int NiewolnicyZloto;
	private int NiewolnicyTowary;
	
	
	public Niewolnicy(int Xniewolnicy, int Yniewolnicy) {
		setXpolozenie(Xniewolnicy);
		setYpolozenie(Yniewolnicy);
		Ubrania = 0;
		Jedzenie = 0;
		NiewolnicyNarzedzia = 0;
		NiewolnicyMaterialy = 0;
		NiewolnicyZloto = 0;
		NiewolnicyTowary = 0;
	}
	
	@Override
	public void Handel() {
		
	}
	
	@Override
	public void ZbieranieTowarow() {
		//if(Xniewolnicy == Xrzemieslnicy+1 lub Xrzemieslnicy lub Xrzemieslnicy-1)
		//if(Yniewolnicy == Yrzemieslnicy+1 lub Yrzemieslnicy lub Yrzemieslnicy-1)
		
	}
	
	public int getUbrania() { return Ubrania; }
	public void setUbrania(int Ubrania) { this.Ubrania = Ubrania; }
	public int getJedzenie() { return Jedzenie; }
	public void setJedzenie(int Jedzenie) { this.Jedzenie = Jedzenie; }
	public int getNnarzedzia() { return NiewolnicyNarzedzia; }
	public void setNnarzedzia(int Narzedzia) { this.NiewolnicyNarzedzia = Narzedzia; }
	public int getNmaterialy() { return NiewolnicyMaterialy; }
	public void setNmaterialy(int Materialy) { this.NiewolnicyMaterialy = Materialy; }
	public int getNzloto() { return NiewolnicyZloto; }
	public void setNzloto(int Zloto) { this.NiewolnicyZloto = Zloto; }
	public int getNtowary() { return NiewolnicyTowary; }
	public void setNtowary(int Towary) { this.NiewolnicyTowary = Towary; }
}