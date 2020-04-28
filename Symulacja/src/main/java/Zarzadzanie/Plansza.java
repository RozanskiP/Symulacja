package Zarzadzanie;

import KlasaSpoleczna.*;

import Niebezpieczenstwo.*;
import Towar.*;

import java.io.IOException;

import Budynki.*;
import RandomoweLiczby.*;


public class Plansza {
	private int Xplanszy;
	private int Yplanszy;
	private static int LiczbaTowarow;
	private Towar TowarNaPlanszy[];
	private static int LiczbaNiebezpieczenstw;
	private GenerujNiebezpieczenstwo NiebezpieczenstwoNaPlanszy[];
	private Budynek WarsztatNaPlanszy;
	private Budynek MennicaNaPlanszy;
	private static KlasaSpoleczna NiewolnikNaPlanszy;
	private static KlasaSpoleczna RzemieslnikNaPlanszy;
	private static KlasaSpoleczna ArystokrataNaPlanszy;
	private ZapisOdczyt zapisodczyt;
	
	
	public Plansza(int X, int Y) {
		this.Xplanszy = X;
		this.Yplanszy = Y;
		LiczbaTowarow = -1;
		LiczbaNiebezpieczenstw = -1;
		NiewolnikNaPlanszy = new Niewolnicy(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		NiewolnikNaPlanszy = new Niewolnicy(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		RzemieslnikNaPlanszy = new Rzemieslnicy(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		ArystokrataNaPlanszy = new Arystokracja(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		WarsztatNaPlanszy = new Warsztat(GeneratorRandom.RandomOd1(Xplanszy),GeneratorRandom.RandomOd1(Yplanszy));
		MennicaNaPlanszy = new Mennica(GeneratorRandom.RandomOd1(Xplanszy),GeneratorRandom.RandomOd1(Yplanszy));
	}
	public ZapisOdczyt getzapisOdczyt() { return zapisodczyt; }
	public int getXplanszy() { return Xplanszy; }
	public int getYplanszy() { return Yplanszy; }
	
	public Towar[] getTowarNaPlanszy() { return TowarNaPlanszy; }
	public void setTowarNaPlanszy(Towar towar) {
		TowarNaPlanszy[++LiczbaTowarow] = towar;
	}
	public GenerujNiebezpieczenstwo[] getNiebezpieczenstwoNaPlanszy() { return NiebezpieczenstwoNaPlanszy; }
	public void setNiebezpieczenstwoNaPlanszy(GenerujNiebezpieczenstwo niebez) {
		NiebezpieczenstwoNaPlanszy[++LiczbaNiebezpieczenstw] = niebez;
	}
	public static int getLiczbaTowarow() { return LiczbaTowarow; }
	public static int getLiczbaNiebezpieczenstw() { return LiczbaNiebezpieczenstw; }
	
	public Budynek getWarsztatNaPlanszy() { return WarsztatNaPlanszy; }
	public Budynek getMennicaNaPlanszy() { return MennicaNaPlanszy; }
	
	public static KlasaSpoleczna getNiewolnikNaPLanszy() { return NiewolnikNaPlanszy; }
	public static KlasaSpoleczna getRzemieslnikNaPlanszy() { return RzemieslnikNaPlanszy; }
	public static KlasaSpoleczna getArystokrataNaPlanszy() { return ArystokrataNaPlanszy; }
	public void setNiewolnikNaPlanszy(KlasaSpoleczna NowaKlasa) {
		NiewolnikNaPlanszy = NowaKlasa;
	}
	public void setRzemieslnikNaPlanszy(KlasaSpoleczna NowaKlasa) {
		RzemieslnikNaPlanszy = NowaKlasa;
	}
	public void setArystokrataNaPlanszy(KlasaSpoleczna NowaKlasa) {
		ArystokrataNaPlanszy = NowaKlasa;
	}
	
	/*
	public static void main(String[] args) throws IOException{
		ZapisOdczyt odcz = new ZapisOdczyt();
		odcz.Odczyt();
		Plansza obj = new Plansza(odcz.getWielkoscPlanszyX(),odcz.getWielkoscPlanszyY());
	}
	*/
}
