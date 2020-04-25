package Zarzadzanie;

import KlasaSpoleczna.*;

import Niebezpieczenstwo.*;
import Towar.*;
import Budynki.*;
import RandomoweLiczby.*;


public class Plansza {
	private int Xplanszy;
	private int Yplanszy;
	private int LiczbaTowarow;
	private Towar TowarNaPlanszy[];
	private int LiczbaNiebezpieczenstw;
	private GenerujNiebezpieczenstwo NiebezpieczenstwoNaPlanszy[];
	private Budynek WarsztatNaPlanszy;
	private Budynek MennicaNaPlanszy;
	private KlasaSpoleczna NiewolnikNaPlanszy;
	private KlasaSpoleczna RzemieslnikNaPlanszy;
	private KlasaSpoleczna ArystokrataNaPlanszy;
	private ZapisOdczyt zapisodczyt;
	
	
	public Plansza(int X, int Y) {
		this.Xplanszy = X;
		this.Yplanszy = Y;
		LiczbaTowarow = -1;
		LiczbaNiebezpieczenstw = -1;
		NiewolnikNaPlanszy = new Niewolnicy(GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyX()), GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyY()));
		RzemieslnikNaPlanszy = new Rzemieslnicy(GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyX()), GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyY()));
		ArystokrataNaPlanszy = new Arystokracja(GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyX()), GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyY()));
		WarsztatNaPlanszy = new Warsztat(GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyX()),GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyY()));
		MennicaNaPlanszy = new Mennica(GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyX()),GeneratorRandom.RandomOd1(zapisodczyt.getWielkoscPlanszyY()));
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
	public int getLiczbaTowarow() { return LiczbaTowarow; }
	public int getLiczbaNiebezpieczenstw() { return LiczbaNiebezpieczenstw; }
	
	public Budynek getWarsztatNaPlanszy() { return WarsztatNaPlanszy; }
	public Budynek getMennicaNaPlanszy() { return MennicaNaPlanszy; }
	
	public KlasaSpoleczna getNiewolnikNaPLanszy() { return NiewolnikNaPlanszy; }
	public KlasaSpoleczna getRzemieslnikNaPlanszy() { return RzemieslnikNaPlanszy; }
	public KlasaSpoleczna getArystokrataNaPlanszy() { return ArystokrataNaPlanszy; }
	public void setNiewolnikNaPlanszy(KlasaSpoleczna NowaKlasa) {
		NiewolnikNaPlanszy = NowaKlasa;
	}
	public void setRzemieslnikNaPlanszy(KlasaSpoleczna NowaKlasa) {
		RzemieslnikNaPlanszy = NowaKlasa;
	}
	public void setArystokrataNaPlanszy(KlasaSpoleczna NowaKlasa) {
		ArystokrataNaPlanszy = NowaKlasa;
	}
}
