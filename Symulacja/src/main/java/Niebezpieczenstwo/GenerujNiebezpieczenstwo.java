package Niebezpieczenstwo;

import RandomoweLiczby.GeneratorRandom;

//Klasa Generujaca Niebezpieczenstwo i nadajaca im wartosci X i Y z planszy
public class GenerujNiebezpieczenstwo {
	private int Xniebezpieczenstwo;
	private int Yniebezpieczenstwo;
	private Niebezpieczenstwo Zabojca;
	
	//Konstruktor przeciazony wybierajacy losowo jednego z 3 zabojców
	public GenerujNiebezpieczenstwo(int X, int Y) {
		Xniebezpieczenstwo = X;
		Yniebezpieczenstwo = Y;
		int a = GeneratorRandom.RandomOd1(3);
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
	//Getery i Setery
	public Niebezpieczenstwo getZabojca() { return Zabojca; }
	public void setZabojca(Niebezpieczenstwo zabojca) { Zabojca = zabojca; }
	public void setXniebezpieczenstwo(int xniebezpieczenstwo) { Xniebezpieczenstwo = xniebezpieczenstwo; }
	public int getXniebezpieczenstwo() { return Xniebezpieczenstwo; }
	public void setYniebezpieczenstwo(int yniebezpieczenstwo) { Yniebezpieczenstwo = yniebezpieczenstwo; }
	public int getYniebezpieczenstwo() { return Yniebezpieczenstwo; }
}
