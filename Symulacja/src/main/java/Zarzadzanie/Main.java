package Zarzadzanie;

import java.io.IOException;

import GUI;
import GUI.Symulacja;

public class Main {
	
	public static void main() throws IOException {
		ZapisOdczyt zapisodczyt = new ZapisOdczyt();
		zapisodczyt.Odczyt();
		
		Plansza plansza = new Plansza(zapisodczyt.getWielkoscPlanszyX(),zapisodczyt.getWielkoscPlanszyY());
		Tura tura = new Tura();
		
		
		tura.DaneStartowe();
		do{
			tura.AktualizacjaPlanszy();
			tura.RuchyKlas();
			tura.ZbierzTowaryKlas();
			tura.HandelKlas();
			tura.Zabojstwa();
			tura.BudynkiNaPlanszy();
			tura.AktualizacjaPopulacjiKlas();
			tura.AwansSpoleczny();
			tura.setLicznikTur(Tura.getLicznikTur()+1);
			System.out.println("Tura: " + Tura.getLicznikTur());
			System.out.println();
			Symulacja.renderPanel.repaint();
		}while(!tura.Wygrana());
		
		
		zapisodczyt.Zapis();
		System.out.println("Symulacja dobieg³a koñca! z iloœci¹ tur równ¹ " + Tura.getLicznikTur());
	}
	
	
	public static void main(String[] args) throws IOException{
		main();
	}
}
