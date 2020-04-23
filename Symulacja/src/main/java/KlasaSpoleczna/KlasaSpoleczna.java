package KlasaSpoleczna;

import Towar.*;

public abstract class KlasaSpoleczna {
	private int Populacja;
	private final static int DodatkowaPopulacjaPrzyAwansie = 10;
	private int Xpolozenie;
	private int Ypolozenie;
	private int Ubrania;
	private int Jedzenie;
	private int Narzedzia;
	private int Materialy;
	private int Zloto;
	private int Towary;
	
	public KlasaSpoleczna(int X, int Y){
		Xpolozenie = X;
		Ypolozenie = Y;
		Ubrania = 0;
		Jedzenie = 0;
		Narzedzia = 0;
		Materialy = 0;
		Zloto = 0;
		Towary = 0;
	}
	
	public void Ruch(int NoweX, int NoweY) {
		this.Xpolozenie = NoweX;
		this.Ypolozenie = NoweY;
	}
	public abstract void Handel(KlasaSpoleczna klasa);
	public abstract void ZbieranieTowarow(Towar towar);
	
	public int getPopulacja() { return this.Populacja; }
	public void setPopulacja(int Populacja) { this.Populacja = Populacja; }
	public int getXpolozenie() { return this.Xpolozenie; }
	public void setXpolozenie(int Xpolozenie) { this.Xpolozenie = Xpolozenie; }
	public int getYpolozenie() { return this.Ypolozenie; }
	public void setYpolozenie(int Ypolozenie) { this.Ypolozenie = Ypolozenie; }
	public int getUbrania() { return Ubrania; }
	public void setUbrania(int ubrania) { Ubrania = ubrania; }
	public int getJedzenie() { return Jedzenie; }
	public void setJedzenie(int jedzenie) { Jedzenie = jedzenie; }
	public int getNarzedzia() { return Narzedzia; }
	public void setNarzedzia(int narzedzia) { Narzedzia = narzedzia; }
	public int getMaterialy() { return Materialy; }
	public void setMaterialy(int materialy) { Materialy = materialy; }
	public int getZloto() { return Zloto; }
	public void setZloto(int zloto) { Zloto = zloto; }
	public int getTowary() { return Towary;}
	public void setTowary(int towary) { Towary = towary; }

}
