package Towar;

import RandomoweLiczby.*;

public class Towar {
	private int Xtowar;
	private int Ytowar;
	private int Narzedzia;
	private int Materialy;
	private int Towary;
	private int Zloto;
	private int Ubrania;
	private int Jedzenie;
	
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
	
	
	public int getXtowar() { return Xtowar; }
	public int getYtowar() {return Ytowar;}
	public int getNarzedzia() { return Narzedzia; }
	public int getMaterialy()  {return Materialy; }
	public int getTowary() { return Towary; }
	public int getZloto() { return Zloto; }
	public int getUbrania() { return Ubrania; }
	public int getJedzenie() { return Jedzenie; }
	
	
	//sprawdzenie czy generuja sie w odpowiedzi sposob
	/*
	public static void main(String[] args) {
		Towar towar = new Towar(10, 10);
		System.out.println(towar.Jedzenie);
		System.out.println(towar.Materialy);
		System.out.println(towar.Towary);
		System.out.println(towar.Zloto);
		System.out.println(towar.Ubrania);
		System.out.println(towar.Narzedzia);
	}
	*/
	
}
