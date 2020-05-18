package Zarzadzanie;

/*
 * @author Pawe� R�a�ski
 * @author Wojtek Bednarczyk
 */


import java.io.IOException;

//Klasa Main przeprowadzajaca ca�a symulacje w odpowiedniej kolejnosci
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
		System.out.println("Symulacja dobieg�a ko�ca! z ilo�ci� tur r�wn� " + Tura.getLicznikTur());
	}
	
	//Statyczna metoda main uruchamajaca symulacje
	public static void main(String[] args) throws IOException{
		main();
	}
}
