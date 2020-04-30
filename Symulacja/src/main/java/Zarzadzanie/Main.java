package Zarzadzanie;

import java.io.IOException;

public class Main {
	
	public static void main() throws IOException {
		ZapisOdczyt zapisodczyt = new ZapisOdczyt();
		zapisodczyt.Odczyt();
		
		Plansza plansza = new Plansza(zapisodczyt.getWielkoscPlanszyX(),zapisodczyt.getWielkoscPlanszyY());
		
		Tura tura = new Tura();
		do{
			tura.RuchyKlas();
			tura.ZbierzTowaryKlas();
			tura.HandelKlas();
			tura.Zabojstwa();
			tura.BudynkiNaPlanszy();
			tura.AwansSpoleczny();
			tura.Wygrana();
			tura.AktualizacjaPlanszy();
			tura.AktualizacjaPopulacjiKlas();
			tura.setLicznikTur(Tura.getLicznikTur()+1);
		}while(!tura.Wygrana());
		
		zapisodczyt.Zapis();
		System.out.println("Licznik tur: " + Tura.getLicznikTur());
	}
	
	
	public static void main(String[] args) throws IOException{
		
		main();
	}
	
	
}
