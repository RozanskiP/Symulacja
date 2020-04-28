package KlasaSpoleczna;

import RandomoweLiczby.*;
import Towar.*;

public abstract class KlasaSpoleczna {
	private int Populacja;
	private int Xpolozenie;
	private int Ypolozenie;
	private int Ubrania;
	private int Jedzenie;
	private int Narzedzia;
	private int Materialy;
	private int Zloto;
	private int Towary;
	private int LicznikTowarow;
	private int LicznikNiebezpieczenstw;
	
	public KlasaSpoleczna(int X, int Y){
		Xpolozenie = X;
		Ypolozenie = Y;
		Ubrania = 0;
		Jedzenie = 0;
		Narzedzia = 0;
		Materialy = 0;
		Zloto = 0;
		Towary = 0;
		LicznikTowarow = 0;
		LicznikNiebezpieczenstw = 0;
	}
	
	public void Ruch() {
		this.Xpolozenie = GeneratorRandom.RandomOd0(2)-1;//zmienic aby proacowalo w zakresie
		this.Ypolozenie = GeneratorRandom.RandomOd0(2)-1;
	}
	
	public abstract void Handel(KlasaSpoleczna klasa);
	public abstract void ZbieranieTowarow(Towar towar);
	public abstract String toString();
	
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

	public int getLicznikTowarow() {
		return LicznikTowarow;
	}

	public void setLicznikTowarow(int licznikTowarow) {
		LicznikTowarow = licznikTowarow;
	}

	public int getLicznikNiebezpieczenstw() {
		return LicznikNiebezpieczenstw;
	}

	public void setLicznikNiebezpieczenstw(int licznikNiebezpieczenstw) {
		LicznikNiebezpieczenstw = licznikNiebezpieczenstw;
	}
	

}
