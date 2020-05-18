package Zarzadzanie;

/*
 * @author Pawe³ Ró¿añski
 * @author Wojtek Bednarczyk
 */


import java.io.IOException;

//Klasa Main przeprowadzajaca ca³a symulacje w odpowiedniej kolejnosci
public class Main {
	
	//Metoda przeprowadzajaca cala symulacja
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
		}while(!tura.Wygrana());
		
		zapisodczyt.Zapis();
		System.out.println("Symulacja dobieg³a koñca! z iloœci¹ tur równ¹ " + Tura.getLicznikTur());
	}
	
	//Statyczna metoda main uruchamajaca symulacje
	public static void main(String[] args) throws IOException{
		main();
	}
}
