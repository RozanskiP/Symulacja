package KlasaSpoleczna;

public class Rzemieslnicy extends KlasaSpoleczna {
	private int Narzedzia;
	private int Materialy;
	private int PopulacjaRzemieslnikow;
	private int Xrzemieslnik;
	private int Yrzemieslnik;
	private int RzemieslnikUbrania;
	private int RzemieslnikJedzenie;
	private int RzemieslnikZloto;
	private int RzemieslnikTowary;
	
	public Rzemieslnicy(int Xrzemieslnicy, int Yrzemieslnicy) {
		this.Xrzemieslnik = Xrzemieslnicy;
		this.Yrzemieslnik = Yrzemieslnicy;
		Narzedzia = 0;
		Materialy = 0;
		PopulacjaRzemieslnikow = 0;
		RzemieslnikUbrania = 0;
		RzemieslnikJedzenie = 0;
		RzemieslnikZloto = 0;
		RzemieslnikTowary = 0;
	}
	@Override
	public void Ruch(int NoweX, int NoweY) {
		this.Xrzemieslnik = NoweX;
		this.Yrzemieslnik = NoweY;
	}
	
	@Override
	public void Handel() {
		
	}
	
	@Override
	public void ZbieranieTowarow() {
		
	}
	
	public int getNarzedzia() { return Narzedzia; }
	public void setNarzedzia(int Narzedzia) { this.Narzedzia = Narzedzia; }
	public int getMaterialy() { return Materialy; }
	public void setMaterialy(int Materialy) { this.Materialy = Materialy; }
	//Dopisac do UML
	public int getPopulacjaRzemieslnikow() { return PopulacjaRzemieslnikow; }
	public void setPopulacjaRzemieslnikow(int populacjaRzemieslnikow) {  PopulacjaRzemieslnikow = populacjaRzemieslnikow; }
	
	public int getXrzemieslnik() { return Xrzemieslnik; }
	public void setXrzemieslnik(int Xrzemieslnik) { this.Xrzemieslnik = Xrzemieslnik; }
	public int getYrzemieslnik() { return Yrzemieslnik; }
	public void setYrzemieslnik(int Yrzemieslnik) { this.Yrzemieslnik = Yrzemieslnik; }
	public int getRzemieslnikUbrania() { return RzemieslnikUbrania; }
	public void setRzemieslnikUbrania(int rzemieslnikUbrania) { RzemieslnikUbrania = rzemieslnikUbrania; }
	public int getRzemieslnikJedzenie() { return RzemieslnikJedzenie; }
	public void setRzemieslnikJedzenie(int rzemieslnikJedzenie) { RzemieslnikJedzenie = rzemieslnikJedzenie; }
	public int getRzemieslnikZloto() { return RzemieslnikZloto; }
	public void setRzemieslnikZloto(int rzemieslnikZloto) { RzemieslnikZloto = rzemieslnikZloto; }
	public int getRzemieslnikTowary() { return RzemieslnikTowary; }
	public void setRzemieslnikTowary(int rzemieslnikTowary) { RzemieslnikTowary = rzemieslnikTowary; }
}