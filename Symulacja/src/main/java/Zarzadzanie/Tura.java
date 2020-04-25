package Zarzadzanie;

import KlasaSpoleczna.*;

public class Tura {
	private int LicznikTur = 0;
	Plansza plansza;
	
	public Tura() {
		LicznikTur = 0;
		plansza = new Plansza(plansza.getzapisOdczyt().getWielkoscPlanszyX(), plansza.getzapisOdczyt().getWielkoscPlanszyY());
	}
	
	
	public int getLicznikTur() { return LicznikTur; }
	public void setLicznikTur(int licznikTur) { LicznikTur = licznikTur; }
	public Plansza getPlansza() { return plansza; }

	public void WartosciPoczatkowe() {
		
	}
	
	public void RuchyKlas() {
		
	}
	
	public void SprawdzanieMiejscNaPlanszy() {
		
	}
	
	public void HandelKlas() {
		
	}
	
	public void ZbierzTowaryKlas() {
		
	}
	
	public void AktualizacjaPlanszy() {
		
	}
	
	public void AktualizacjaPopulacjiKlas() {
		
	}
	
	public void Wygrana() {
		
	}
	
	public void AwansSpoleczny() {
		
	}
	
}
