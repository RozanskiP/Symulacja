package KlasaSpoleczna;

public class Arystokracja extends KlasaSpoleczna{
	private int Zloto;
	private int Towary;
	private int PopulacjaArystokracji;
	private int Xarystokracja;
	private int Yarystokracja;
	private int ArystokracjaUbrania;
	private int ArystokracjaJedzenie;
	private int ArystokracjaNarzedzia;
	private int ArystokracjaMaterialy;
	
	
	
	public Arystokracja(int Xarystokracja, int Yarystokracja) {
		this.Xarystokracja = Xarystokracja;
		this.Yarystokracja = Yarystokracja;
		Zloto = 0;
		Towary = 0;
		PopulacjaArystokracji = 0;
		ArystokracjaUbrania = 0;
		ArystokracjaJedzenie = 0;
		ArystokracjaNarzedzia = 0;
		ArystokracjaMaterialy = 0;
	}
	
	@Override
	public void Ruch(int NoweX, int NoweY) {
		this.Xarystokracja = NoweX;
		this.Yarystokracja = NoweY;
	}
	
	@Override
	public void Handel() {
		
	}
	
	@Override
	public void ZbieranieTowarow() {
		
	}

	public int getZloto() { return Zloto; }
	public void setZloto(int zloto) { Zloto = zloto; }
	public int getTowary() { return Towary; }
	public void setTowary(int towary) { Towary = towary; }
	//Dopisac do UML
	public int getPopulacjaArystokracji() { return PopulacjaArystokracji; }
	public void setPopulacjaArystokracji(int populacjaArystokracji) { PopulacjaArystokracji = populacjaArystokracji; }
	
	public int getXarystokracja() { return Xarystokracja; }
	public void setXarystokracja(int xarystokracja) { Xarystokracja = xarystokracja; }
	public int getYarystokracja() { return Yarystokracja; }
	public void setYarystokracja(int yarystokracja) { Yarystokracja = yarystokracja; }
	public int getArystokracjaUbrania() { return ArystokracjaUbrania; }
	public void setArystokracjaUbrania(int arystokracjaUbrania) { ArystokracjaUbrania = arystokracjaUbrania; }
	public int getArystokracjaJedzenie() { return ArystokracjaJedzenie; }
	public void setArystokracjaJedzenie( int arystokracjaJedzenie) {ArystokracjaJedzenie = arystokracjaJedzenie; }
	public int getArystokracjaNarzedzia() { return ArystokracjaNarzedzia; }
	public void setArystokracjaNarzedzia(int arystokracjaNarzedzia) { ArystokracjaNarzedzia = arystokracjaNarzedzia; }
	public int getArystokracjaMaterialy() { return ArystokracjaMaterialy; }
	public void setArystokracjaMaterialy(int arystokracjaMaterialy) { ArystokracjaMaterialy = arystokracjaMaterialy; }
}
