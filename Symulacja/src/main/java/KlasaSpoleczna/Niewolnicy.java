package KlasaSpoleczna;

public class Niewolnicy extends KlasaSpoleczna {
	private int Ubrania;
	private int Jedzenie;
	private int PopulacjaNiewolnikow;
	private int Xniewolnicy;
	private int Yniewolnicy;
	private int NiewolnicyNarzedzia;
	private int NiewolnicyMaterialy;
	private int NiewolnicyZloto;
	private int NiewolnicyTowary;
	
	public Niewolnicy(int Xniewolnicy, int Yniewolnicy) {
		this.Xniewolnicy = Xniewolnicy;
		this.Yniewolnicy = Yniewolnicy;
		Ubrania = 0;
		Jedzenie = 0;
		PopulacjaNiewolnikow = 0;
		NiewolnicyNarzedzia = 0;
		NiewolnicyMaterialy = 0;
		NiewolnicyZloto = 0;
		NiewolnicyTowary = 0;
	}
	
	@Override
	public void Ruch(int NoweX, int NoweY) {
		this.Xniewolnicy = NoweX;
		this.Yniewolnicy = NoweY;
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
	//Dopisac do UML 
	public int getPopulacjaNiewolnikow() { return PopulacjaNiewolnikow; }
	public void setPopulacjaNiewolnikow(int Populacja) { this.PopulacjaNiewolnikow = Populacja; }
		
	public int getXniewolnicy() { return Xniewolnicy; }
	public void setXniewolnicy(int Xniewolnicy) {  this.Xniewolnicy = Xniewolnicy; }
	public int getYniewolnicy() { return Yniewolnicy; }
	public void setYniewolnicy(int Yniewolnicy) { this.Yniewolnicy = Yniewolnicy; }
	public int getNnarzedzia() { return NiewolnicyNarzedzia; }
	public void setNnarzedzia(int Narzedzia) { this.NiewolnicyNarzedzia = Narzedzia; }
	public int getNmaterialy() { return NiewolnicyMaterialy; }
	public void setNmaterialy(int Materialy) { this.NiewolnicyMaterialy = Materialy; }
	public int getNzloto() { return NiewolnicyZloto; }
	public void setNzloto(int Zloto) { this.NiewolnicyZloto = Zloto; }
	public int getNtowary() { return NiewolnicyTowary; }
	public void setNtowary(int Towary) { this.NiewolnicyTowary = Towary; }
}