package Niebezpieczenstwo;

import RandomoweLiczby.GeneratorRandom;

public class GenerujNiebezpieczenstwo {
	private static int Xniebezpieczenstwo;
	private static int Yniebezpieczenstwo;
	private static Niebezpieczenstwo Zabojca;
	
	public GenerujNiebezpieczenstwo(int X, int Y) {
		Xniebezpieczenstwo = X;
		Yniebezpieczenstwo = Y;
		int a = 1; // GeneratorRandom.RandomOd1(3);
		switch(a) {
		case 1: Zabojca = new Bandyci();
			break;
		case 2: Zabojca = new DzikieZwierzeta();
			break;
		case 3: Zabojca = new Zlodzieje();
			break;
		default:
			break;
		}
	}
	public static Niebezpieczenstwo getZabojca() { return Zabojca; }
	
	public void setXniebezpieczenstwo(int xniebezpieczenstwo) { Xniebezpieczenstwo = xniebezpieczenstwo; }
	public static int getXniebezpieczenstwo() { return Xniebezpieczenstwo; }
	public void setYniebezpieczenstwo(int yniebezpieczenstwo) { Yniebezpieczenstwo = yniebezpieczenstwo; }
	public static int getYniebezpieczenstwo() { return Yniebezpieczenstwo; }
	
	/*
	public static void main(String[] args) {
		GenerujNiebezpieczenstwo obj = new GenerujNiebezpieczenstwo(5, 10);
		int PopulacjaKotkow = 10;
		 PopulacjaKotkow = PopulacjaKotkow - obj.getZabojca().ZmniejszIloscPopulacja();
		 System.out.println(PopulacjaKotkow);
	}
	*/
}
