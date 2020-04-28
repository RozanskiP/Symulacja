package Zarzadzanie;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import KlasaSpoleczna.*;

//Klasa do zapisu i odczytu danych z pliku
public class ZapisOdczyt {
	//Pola klasy ZapisOczyt
	private float NiewolnicySzansa;
	private float RzemieslnicySzansa;
	private int ArystokracjaWiekszaPopulacja;
	private int WielkoscPlanszyX;
	private int WielkoscPlanszyY;
	private int PopulacjaStartowaNiewolnicy;
	private int PopulacjaStartowaRzemieslnicy;
	private int PopulacjaStartowaArystokracja;
	private int POPULACJAMAX;
	private KlasaSpoleczna WygranaKlasa = new Niewolnicy(10,10);
	private KlasaSpoleczna Miejsce2 = new Rzemieslnicy(10,10);
	private KlasaSpoleczna Miejsce3 = new Arystokracja(10,10);
	private int WygranaKlasaPopulacja;
	private int Miejsce2Populacja;
	private int Miejsce3Populacja;
	
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
		
		System.out.println(liczby);
	}
	//Zapisywanie danych po skoñczonej symulacji
	public void Zapis() throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("DaneKoncowe.txt");
		
		zapis.println("Wygra³a klasa : " + WygranaKlasa.toString());
		zapis.println("zdobywaj¹c wymagan¹ populacje : " + WygranaKlasaPopulacja);
		zapis.println();
		zapis.println("Klasa na drugim miejscu to : " + Miejsce2.toString());
		zapis.println("zdobywaj¹c : " + Miejsce2Populacja);
		zapis.println();
		zapis.println("A na 3 miejscu znalaz³a sie : " + Miejsce3.toString());
		zapis.println("zdobywaj¹c : " + Miejsce3Populacja);
		zapis.println();
		zapis.println("Na planszy pojawi³o sie : " + Plansza.getLiczbaNiebezpieczenstw() + " Niebezpieczenstw");
		zapis.println();
		zapis.println("Na planszy pojawi³o sie : " + Plansza.getLiczbaTowarow() + " Towarów");
		zapis.println();
		zapis.println("Klasy zebra³y po (Pierwsza liczba to Towary a druga to Niebezpieczenstwa)");
		zapis.println("Niewolnicy   : " + Plansza.getNiewolnikNaPLanszy().getLicznikTowarow() + " : " + Plansza.getNiewolnikNaPLanszy().getLicznikNiebezpieczenstw());
		zapis.println("Rzemieslnicy : " + Plansza.getRzemieslnikNaPlanszy().getLicznikTowarow() + " : " + Plansza.getRzemieslnikNaPlanszy().getLicznikNiebezpieczenstw());
		zapis.println("Arystokracja : " + Plansza.getArystokrataNaPlanszy().getLicznikTowarow() + " : " + Plansza.getArystokrataNaPlanszy().getLicznikNiebezpieczenstw());
		
		zapis.close();
	}

	
	//Wszystkie setet i getery pol
	public float getNiewolnicySzansa() { return NiewolnicySzansa; }
	public float getRzemieslnicySzansa() { return RzemieslnicySzansa; }
	public int getArystokracjaWiekszaPopulacja() {
		return ArystokracjaWiekszaPopulacja;
	}
	public int getWielkoscPlanszyX() { return WielkoscPlanszyX; }
	public int getWielkoscPlanszyY() { return WielkoscPlanszyY; }
	public int getPopulacjaStartowaNiewolnicy() {
		return PopulacjaStartowaNiewolnicy;
	}
	public int getPopulacjaStartowaRzemieslnicy() {
		return PopulacjaStartowaRzemieslnicy;
	}
	public int getPopulacjaStartowaArystokracja() {
		return PopulacjaStartowaArystokracja;
	}
	public int getPOPULACJAMAX() {
		return POPULACJAMAX;
	}
}
