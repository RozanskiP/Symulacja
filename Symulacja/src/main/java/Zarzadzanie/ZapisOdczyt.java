package Zarzadzanie;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import KlasaSpoleczna.*;

//Klasa do zapisu i odczytu danych z pliku
public class ZapisOdczyt {
	//Pola klasy ZapisOczyt
	private static int NiewolnicySzansa;
	private static int RzemieslnicySzansa;
	private static int ArystokracjaWiekszaPopulacja;
	private int WielkoscPlanszyX;
	private int WielkoscPlanszyY;
	private static int PopulacjaStartowaNiewolnicy;
	private static int PopulacjaStartowaRzemieslnicy;
	private static int PopulacjaStartowaArystokracja;
	private static int POPULACJAMAX;
	private static KlasaSpoleczna WygranaKlasa;
	private static KlasaSpoleczna Miejsce2;
	private static KlasaSpoleczna Miejsce3;
	private static int WygranaKlasaPopulacja;
	private static int Miejsce2Populacja;
	private static int Miejsce3Populacja;
	
	//Odczytywanie wartoœci pocza¹tkowych z pliku
	public void Odczyt() throws IOException{
		//Otwarcie Pliku 'DaneStartowe.txt'
		FileReader file = new FileReader("DaneStartowe.txt");
		BufferedReader in = new BufferedReader(file);
		
		//Wpisanie wszystkich liniej do jednego Stringu
		String s;
		StringBuilder SB = new StringBuilder();
		while((s = in.readLine()) != null)
			SB.append(s + "\n");
		
		in.close();
		
		//Wyrazenie regularne wypisuajce wszystkie liczby 
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(SB);
		
		//Wpisanie wszystich liczb do kontenera ArrayList<Integer>
		List<Integer> liczby = new ArrayList<Integer>();
		while(m.find()) {
			String i = m.group();
			liczby.add(Integer.valueOf(i));
		}
		
		//Zapisanie wszystkich liczb do zmiennych pol klasy
		NiewolnicySzansa = liczby.get(0);
		RzemieslnicySzansa = liczby.get(1);
		ArystokracjaWiekszaPopulacja = liczby.get(2);
		WielkoscPlanszyX = liczby.get(3);
		WielkoscPlanszyY = liczby.get(4);
		PopulacjaStartowaNiewolnicy = liczby.get(5);
		PopulacjaStartowaRzemieslnicy = liczby.get(6);
		PopulacjaStartowaArystokracja = liczby.get(7);
		POPULACJAMAX = liczby.get(8);
		
		//System.out.println(liczby);
	}

	//Zapisywanie danych po skoñczonej symulacji
	public void Zapis() throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("DaneKoncowe.txt");
		
		zapis.println("Wygra³a klasa : 				" + WygranaKlasa.toString());
		zapis.println("zdobywaj¹c wymagan¹ populacje :	" + WygranaKlasaPopulacja);
		zapis.println();
		zapis.println("Klasa na drugim miejscu to : 	" + Miejsce2.toString());
		zapis.println("zdobywaj¹c :					" + Miejsce2Populacja);
		zapis.println();
		zapis.println("A na 3 miejscu znalaz³a sie : 	" + Miejsce3.toString());
		zapis.println("zdobywaj¹c : 					" + Miejsce3Populacja);
		zapis.println();
		zapis.println("Na planszy pozosta³o : " + Plansza.getNiebezpieczenstwoNaPlanszy().size() + " niezebranych Niebezpieczenstw");
		zapis.println();
		zapis.println("Na planszy pozosta³o : " + Plansza.getTowarNaPlanszy().size() + " niezebranych Towarów");
		zapis.println();
		zapis.println("Klasy mia³y kontakt z (Pierwsza liczba to Towary a druga to Niebezpieczenstwa)");
		zapis.println("Niewolnicy   : " + Plansza.getNiewolnikNaPLanszy().getLicznikTowarow() + " : " + Plansza.getNiewolnikNaPLanszy().getLicznikNiebezpieczenstw());
		zapis.println("Rzemieslnicy : " + Plansza.getRzemieslnikNaPlanszy().getLicznikTowarow() + " : " + Plansza.getRzemieslnikNaPlanszy().getLicznikNiebezpieczenstw());
		zapis.println("Arystokracja : " + Plansza.getArystokrataNaPlanszy().getLicznikTowarow() + " : " + Plansza.getArystokrataNaPlanszy().getLicznikNiebezpieczenstw());
		zapis.println();
		zapis.println("Liczba Tura wynosi³a: " + Tura.getLicznikTur());
		
		zapis.close();
	}

	
	//Wszystkie setet i getery pol
	public static int getNiewolnicySzansa() { return NiewolnicySzansa; }
	public static int getRzemieslnicySzansa() { return RzemieslnicySzansa; }
	public static int getArystokracjaWiekszaPopulacja() {
		return ArystokracjaWiekszaPopulacja;
	}
	public int getWielkoscPlanszyX() { return WielkoscPlanszyX; }
	public int getWielkoscPlanszyY() { return WielkoscPlanszyY; }
	public static int getPopulacjaStartowaNiewolnicy() {
		return PopulacjaStartowaNiewolnicy;
	}
	public static int getPopulacjaStartowaRzemieslnicy() {
		return PopulacjaStartowaRzemieslnicy;
	}
	public static int getPopulacjaStartowaArystokracja() {
		return PopulacjaStartowaArystokracja;
	}
	public static int getPOPULACJAMAX() {
		return POPULACJAMAX;
	}
	public static KlasaSpoleczna getWygranaKlasa() {
		return WygranaKlasa;
	}
	public static void setWygranaKlasa(KlasaSpoleczna wygranaKlasa) {
		WygranaKlasa = wygranaKlasa;
	}
	public KlasaSpoleczna getMiejsce2() {
		return Miejsce2;
	}
	public static void setMiejsce2(KlasaSpoleczna miejsce2) {
		Miejsce2 = miejsce2;
	}
	public KlasaSpoleczna getMiejsce3() {
		return Miejsce3;
	}
	public static void setMiejsce3(KlasaSpoleczna miejsce3) {
		Miejsce3 = miejsce3;
	}
	public int getWygranaKlasaPopulacja() {
		return WygranaKlasaPopulacja;
	}
	public static void setWygranaKlasaPopulacja(int wygranaKlasaPopulacja) {
		WygranaKlasaPopulacja = wygranaKlasaPopulacja;
	}
	public int getMiejsce2Populacja() {
		return Miejsce2Populacja;
	}
	public static void setMiejsce2Populacja(int miejsce2Populacja) {
		Miejsce2Populacja = miejsce2Populacja;
	}
	public int getMiejsce3Populacja() {
		return Miejsce3Populacja;
	}
	public static void setMiejsce3Populacja(int miejsce3Populacja) {
		Miejsce3Populacja = miejsce3Populacja;
	}
}
