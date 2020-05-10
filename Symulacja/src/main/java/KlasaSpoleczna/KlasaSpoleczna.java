package KlasaSpoleczna;

import RandomoweLiczby.*;
import Towar.*;
import Zarzadzanie.Plansza;

//Abstraktyjna klasa KlasaSpoleczna posiadaj¹ca metody i pola dla ka¿dej z klas
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
	
	//Konstruktor Abstraktycjny z nadaniem wartosci poczatkowych
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
	//Metoda wykonujaca ruch KlasySpolecznej po Planszy
	public void Ruch() {
		
		int a = Xpolozenie;
		int b = Ypolozenie;
		
		do {
			a = a + GeneratorRandom.RandomOd0(3)-1;
		}while(!(a >= 1 && a <= Plansza.getXplanszy()));
		
		do {
			b = b + GeneratorRandom.RandomOd0(3)-1;
		}while(!(b >= 1 && b <= Plansza.getYplanszy()));
		
		this.Xpolozenie = a;
		this.Ypolozenie = b;
	}
	
	//Metody abstrakcyjne dla pozniejszego zaimplementowania
	public abstract void Handel(KlasaSpoleczna klasa);
	public abstract String toString();
	
	//Metoda zbierajaca Towar podany jako argument w funkcji
	public void ZbieranieTowarow(Towar towar) {
		setJedzenie(getJedzenie()+towar.getJedzenie());
		setUbrania(getUbrania()+towar.getUbrania());
		setNarzedzia(getNarzedzia()+towar.getNarzedzia());
		setMaterialy(getMaterialy()+towar.getMaterialy());
		setTowary(getTowary()+towar.getTowary());
		setZloto(getZloto()+towar.getZloto());
	}
	
	//Getery i Setery dla kazdego z pol
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
	public int getLicznikTowarow() { return LicznikTowarow;}
	public void setLicznikTowarow(int licznikTowarow) { LicznikTowarow = licznikTowarow; }
	public int getLicznikNiebezpieczenstw() { return LicznikNiebezpieczenstw; }
	public void setLicznikNiebezpieczenstw(int licznikNiebezpieczenstw) { LicznikNiebezpieczenstw = licznikNiebezpieczenstw; }
}
