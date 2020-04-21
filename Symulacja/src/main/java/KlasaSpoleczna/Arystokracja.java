package KlasaSpoleczna;

public class Arystokracja extends KlasaSpoleczna{
	private int Zloto;
	private int Towary;
	private int ArystokracjaUbrania;
	private int ArystokracjaJedzenie;
	private int ArystokracjaNarzedzia;
	private int ArystokracjaMaterialy;
	
	
	public Arystokracja(int Xarystokracja, int Yarystokracja) {
		setXpolozenie(Xarystokracja);
		setYpolozenie(Yarystokracja);
		Zloto = 0;
		Towary = 0;
		ArystokracjaUbrania = 0;
		ArystokracjaJedzenie = 0;
		ArystokracjaNarzedzia = 0;
		ArystokracjaMaterialy = 0;
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
	public int getArystokracjaUbrania() { return ArystokracjaUbrania; }
	public void setArystokracjaUbrania(int arystokracjaUbrania) { ArystokracjaUbrania = arystokracjaUbrania; }
	public int getArystokracjaJedzenie() { return ArystokracjaJedzenie; }
	public void setArystokracjaJedzenie( int arystokracjaJedzenie) {ArystokracjaJedzenie = arystokracjaJedzenie; }
	public int getArystokracjaNarzedzia() { return ArystokracjaNarzedzia; }
	public void setArystokracjaNarzedzia(int arystokracjaNarzedzia) { ArystokracjaNarzedzia = arystokracjaNarzedzia; }
	public int getArystokracjaMaterialy() { return ArystokracjaMaterialy; }
	public void setArystokracjaMaterialy(int arystokracjaMaterialy) { ArystokracjaMaterialy = arystokracjaMaterialy; }
}
