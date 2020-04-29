package Zarzadzanie;

import java.util.*;

import KlasaSpoleczna.*;
import Niebezpieczenstwo.*;
import Towar.*;
import Budynki.*;
import RandomoweLiczby.*;


public class Plansza {
	private static int Xplanszy;
	private static int Yplanszy;
	private static int LiczbaTowarow= -1;
	private static ArrayList<Towar> TowarNaPlanszy;
	private static int LiczbaNiebezpieczenstw = -1;
	private ArrayList<GenerujNiebezpieczenstwo> NiebezpieczenstwoNaPlanszy;
	private Budynek WarsztatNaPlanszy;
	private Budynek MennicaNaPlanszy;
	private static KlasaSpoleczna NiewolnikNaPlanszy;
	private static KlasaSpoleczna RzemieslnikNaPlanszy;
	private static KlasaSpoleczna ArystokrataNaPlanszy;
	
	
	public Plansza(int X, int Y) {
		Xplanszy = X;
		Yplanszy = Y;
		TowarNaPlanszy = new ArrayList<>();
		LiczbaTowarow = 0;
		NiebezpieczenstwoNaPlanszy = new ArrayList<>();
		LiczbaNiebezpieczenstw = 0;
		NiewolnikNaPlanszy = new Niewolnicy(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		RzemieslnikNaPlanszy = new Rzemieslnicy(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		ArystokrataNaPlanszy = new Arystokracja(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		WarsztatNaPlanszy = new Warsztat(GeneratorRandom.RandomOd1(Xplanszy),GeneratorRandom.RandomOd1(Yplanszy));
		MennicaNaPlanszy = new Mennica(GeneratorRandom.RandomOd1(Xplanszy),GeneratorRandom.RandomOd1(Yplanszy));
	}
	
	public static int getXplanszy() { return Xplanszy; }
	public static int getYplanszy() { return Yplanszy; }
	
	public static ArrayList<Towar> getTowarNaPlanszy() { return TowarNaPlanszy; }
	public void setTowarNaPlanszy(Towar towar) {
		TowarNaPlanszy.add(towar);
	}
	public ArrayList<GenerujNiebezpieczenstwo> getNiebezpieczenstwoNaPlanszy() { return NiebezpieczenstwoNaPlanszy; }
	public void setNiebezpieczenstwoNaPlanszy(GenerujNiebezpieczenstwo niebezpieczenstwo) {
		NiebezpieczenstwoNaPlanszy.add(niebezpieczenstwo);
	}
	public static int getLiczbaTowarow() { return LiczbaTowarow; }
	public static int getLiczbaNiebezpieczenstw() { return LiczbaNiebezpieczenstw; }
	
	public Budynek getWarsztatNaPlanszy() { return WarsztatNaPlanszy; }
	public Budynek getMennicaNaPlanszy() { return MennicaNaPlanszy; }
	
	public static KlasaSpoleczna getNiewolnikNaPLanszy() { return NiewolnikNaPlanszy; }
	public static KlasaSpoleczna getRzemieslnikNaPlanszy() { return RzemieslnikNaPlanszy; }
	public static KlasaSpoleczna getArystokrataNaPlanszy() { return ArystokrataNaPlanszy; }
	public static void setNiewolnikNaPlanszy(KlasaSpoleczna NowaKlasa) {
		NiewolnikNaPlanszy = NowaKlasa;
	}
	public static void setRzemieslnikNaPlanszy(KlasaSpoleczna NowaKlasa) {
		RzemieslnikNaPlanszy = NowaKlasa;
	}
	public static void setArystokrataNaPlanszy(KlasaSpoleczna NowaKlasa) {
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
