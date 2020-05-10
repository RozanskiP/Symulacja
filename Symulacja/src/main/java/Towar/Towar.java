package Towar;

import RandomoweLiczby.*;

//Klasa tworzaca nowy i losowo przypisujaca mu liczbe rzeczy i umiejscowanie na planszy
public class Towar {
	private int Xtowar;
	private int Ytowar;
	private int Narzedzia;
	private int Materialy;
	private int Towary;
	private int Zloto;
	private int Ubrania;
	private int Jedzenie;
	
	//Konstruktor przeciazony pobierajacy jako argumenty polozenie X i polozenie Y
	public Towar(int Xtowar, int Ytowar) {
		this.Xtowar = Xtowar;
		this.Ytowar = Ytowar;
		Narzedzia = GeneratorRandom.RandomOd0(5);
		Materialy = GeneratorRandom.RandomOd0(5);
		Towary = GeneratorRandom.RandomOd0(5);
		Zloto = GeneratorRandom.RandomOd0(5);
		Ubrania = GeneratorRandom.RandomOd0(5);
		Jedzenie = GeneratorRandom.RandomOd0(5);
	}
	
	//Getery i Setery
	public int getXtowar() { return Xtowar; }
	public int getYtowar() {return Ytowar;}
	public int getNarzedzia() { return Narzedzia; }
	public int getMaterialy()  {return Materialy; }
	public int getTowary() { return Towary; }
	public int getZloto() { return Zloto; }
	public int getUbrania() { return Ubrania; }
	public int getJedzenie() { return Jedzenie; }
	public void setNarzedzia(int narzedzia) { Narzedzia = narzedzia; }
	public void setMaterialy(int materialy) { Materialy = materialy; }
	public void setTowary(int towary) { Towary = towary; }
	public void setZloto(int zloto) { Zloto = zloto; }
	public void setUbrania(int ubrania) { Ubrania = ubrania; }
	public void setJedzenie(int jedzenie) { Jedzenie = jedzenie; }
}
