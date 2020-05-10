package Zarzadzanie;

import java.util.*;

import KlasaSpoleczna.*;
import Niebezpieczenstwo.*;
import Towar.*;
import Budynki.*;
import RandomoweLiczby.*;

//Klasa zawierajaca wszystkie obiekty z planszy i nadajaca im wartosci poczatkowe
public class Plansza {
	private static int Xplanszy;
	private static int Yplanszy;
	private static ArrayList<Towar> TowarNaPlanszy;
	private static ArrayList<GenerujNiebezpieczenstwo> NiebezpieczenstwoNaPlanszy;
	private static Budynek WarsztatNaPlanszy;
	private static Budynek MennicaNaPlanszy;
	private static KlasaSpoleczna NiewolnikNaPlanszy;
	private static KlasaSpoleczna RzemieslnikNaPlanszy;
	private static KlasaSpoleczna ArystokrataNaPlanszy;
	
	//Konstruktor przeciazony z argumentami nadajacymi rozmiar planszy i generujacy poczatkowe polozenia wszystkich obiektow planszy
	public Plansza(int X, int Y) {
		Xplanszy = X;
		Yplanszy = Y;
		TowarNaPlanszy = new ArrayList<>();
		NiebezpieczenstwoNaPlanszy = new ArrayList<>();
		NiewolnikNaPlanszy = new Niewolnicy(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		RzemieslnikNaPlanszy = new Rzemieslnicy(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		ArystokrataNaPlanszy = new Arystokracja(GeneratorRandom.RandomOd1(Xplanszy), GeneratorRandom.RandomOd1(Yplanszy));
		WarsztatNaPlanszy = new Warsztat(GeneratorRandom.RandomOd1(Xplanszy),GeneratorRandom.RandomOd1(Yplanszy));
		MennicaNaPlanszy = new Mennica(GeneratorRandom.RandomOd1(Xplanszy),GeneratorRandom.RandomOd1(Yplanszy));
	}
	
	
	//Getery i Setery
	public static void setMennicaNaPlanszy(Budynek mennicaNaPlanszy) {
		MennicaNaPlanszy = mennicaNaPlanszy;
	}

	public static int getXplanszy() { return Xplanszy; }
	public static int getYplanszy() { return Yplanszy; }
	
	public static ArrayList<Towar> getTowarNaPlanszy() { return TowarNaPlanszy; }
	public static void setTowarNaPlanszy(Towar towar) {
		TowarNaPlanszy.add(towar);
	}
	public static ArrayList<GenerujNiebezpieczenstwo> getNiebezpieczenstwoNaPlanszy() { return NiebezpieczenstwoNaPlanszy; }
	public static void setNiebezpieczenstwoNaPlanszy(GenerujNiebezpieczenstwo niebezpieczenstwo) {
		NiebezpieczenstwoNaPlanszy.add(niebezpieczenstwo);
	}
	
	public static Budynek getWarsztatNaPlanszy() { return WarsztatNaPlanszy; }
	public static Budynek getMennicaNaPlanszy() { return MennicaNaPlanszy; }
	
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
}
