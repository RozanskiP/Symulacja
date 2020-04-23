package Zarzadzanie;
import KlasaSpoleczna.*;

import KlasaSpoleczna.KlasaSpoleczna;

public class Plansza {
	private int Xplanszy;
	private int Yplanszy;
	//private Towar TowarNaPlanszy;
	//private GenerujNiebezpieczenstwo NiebezpieczenstwoNaPlanszy
	//private Budynek warsztat;
	//private Budynek mennica;
	private KlasaSpoleczna NiewolnikNaPlanszy;
	private KlasaSpoleczna RzemieslnikNaPlanszy;
	private KlasaSpoleczna ArystokrataNaPlanszy;
	
	public Plansza(int X, int Y) {
		
	}
	
	public KlasaSpoleczna getNiewolnikNaPlanszy() { return NiewolnikNaPlanszy; }
	public KlasaSpoleczna getRzemieslnikNaPlanszy() { return RzemieslnikNaPlanszy; }
	public KlasaSpoleczna getArystokrataNaPlanszy() { return ArystokrataNaPlanszy; }
	
}
