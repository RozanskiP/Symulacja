package Zarzadzanie;

import KlasaSpoleczna.*;
import Towar.Towar;

public class Tura {
	private int LicznikTur = 0;
	//private Plansza plansza;
	
	public Tura() {
		LicznikTur = 0;
	}
	
	
	public int getLicznikTur() { return LicznikTur; }
	public void setLicznikTur(int licznikTur) { LicznikTur = licznikTur; }
	//public Plansza getPlansza() { return plansza; }

	public void WartosciPoczatkowe() {
		
	}
	
	public void RuchyKlas() {
		Plansza.getNiewolnikNaPLanszy().Ruch();
		Plansza.getRzemieslnikNaPlanszy().Ruch();
		Plansza.getArystokrataNaPlanszy().Ruch();
	}
	
	public void SprawdzanieMiejscNaPlanszy() {
		
	}
	
	public void HandelKlas() {
		
	}
	
	public void ZbierzTowaryKlas() {
		
		for(int i=0; i < Plansza.getLiczbaTowarow(); i++) {
			if(Plansza.getTowarNaPlanszy(i).getXtowar()-1 <= Plansza.getNiewolnikNaPLanszy().getXpolozenie() && Plansza.getTowarNaPlanszy(i).getXtowar()+1 >= Plansza.getNiewolnikNaPLanszy().getXpolozenie()) {
			
			}
		}
	}
	
	public void AktualizacjaPlanszy() {
		
	}
	
	public void AktualizacjaPopulacjiKlas() {
		
	}
	
	public void Wygrana() {
		
	}
	
	public void AwansSpoleczny() {
		
	}
	
	public static void main(String[] args) {
		Plansza pla = new Plansza(10, 11);
		KlasaSpoleczna niew = new Niewolnicy(6,6);
		Tura tura = new Tura();
		pla.setTowarNaPlanszy(new Towar(5,5));
		System.out.println(niew.getJedzenie());
		System.out.println(niew.getMaterialy());
		System.out.println(niew.getNarzedzia());
		System.out.println(niew.getTowary());
		System.out.println(niew.getUbrania());
		System.out.println(niew.getZloto());
		
		
		tura.ZbierzTowaryKlas();
	}
	
}
