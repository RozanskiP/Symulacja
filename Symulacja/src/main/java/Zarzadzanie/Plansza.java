package Zarzadzanie;

import KlasaSpoleczna.*;
import Niebezpieczenstwo.*;
import Towar.*;
import Budynki.*;


public class Plansza {
	private static int Xplanszy;
	private static int Yplanszy;
	private Towar TowarNaPlanszy;
	private GenerujNiebezpieczenstwo NiebezpieczenstwoNaPlanszy;
	private Budynek warsztat;
	private Budynek mennica;
	private KlasaSpoleczna NiewolnikNaPlanszy;
	private KlasaSpoleczna RzemieslnikNaPlanszy;
	private KlasaSpoleczna ArystokrataNaPlanszy;
	
	
	public Plansza(int X, int Y) {
		this.Xplanszy = X;
		this.Yplanszy = Y;
	}
	
	public int getXplanszy() { return Xplanszy; }
	public int getYplanszy() { return Yplanszy; }
}
