package Zarzadzanie;

import KlasaSpoleczna.*;
import RandomoweLiczby.GeneratorRandom;
import Towar.Towar;
import Niebezpieczenstwo.*;
import Budynki.*;

public class Tura {
	private static int LicznikTur;
	
	
	public Tura() {
		LicznikTur = 0;
	}
	
	
	public static int getLicznikTur() { return LicznikTur; }
	public void setLicznikTur(int licznikTur) { LicznikTur = licznikTur; }
	
	public void RuchyKlas() {
		System.out.println("RuchKlas");
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		Plansza.getNiewolnikNaPLanszy().Ruch();
		Plansza.getRzemieslnikNaPlanszy().Ruch();
		Plansza.getArystokrataNaPlanszy().Ruch();
	}
	
	public void HandelKlas() {
		System.out.println("HandelKlas");
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		Plansza.getNiewolnikNaPLanszy().Handel(Plansza.getRzemieslnikNaPlanszy());
		Plansza.getNiewolnikNaPLanszy().Handel(Plansza.getArystokrataNaPlanszy());
		
		Plansza.getRzemieslnikNaPlanszy().Handel(Plansza.getNiewolnikNaPLanszy());
		Plansza.getRzemieslnikNaPlanszy().Handel(Plansza.getArystokrataNaPlanszy());
		
		Plansza.getArystokrataNaPlanszy().Handel(Plansza.getNiewolnikNaPLanszy());
		Plansza.getArystokrataNaPlanszy().Handel(Plansza.getRzemieslnikNaPlanszy());
		
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
	}
	
	public void ZbierzTowaryKlas() {
		System.out.println("ZbierzTowaryKlas");
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		for(int i=0;i<Plansza.getTowarNaPlanszy().size();i++) {
			for(Towar towar : Plansza.getTowarNaPlanszy()) {
				
				if(Plansza.getNiewolnikNaPLanszy().getXpolozenie()-1 <= towar.getXtowar() && Plansza.getNiewolnikNaPLanszy().getXpolozenie()+1 >= towar.getXtowar()) 
					if(Plansza.getNiewolnikNaPLanszy().getYpolozenie()-1 <= towar.getYtowar() && Plansza.getNiewolnikNaPLanszy().getYpolozenie()+1 >= towar.getYtowar()) {
						Plansza.getNiewolnikNaPLanszy().ZbieranieTowarow(towar);
						Plansza.getTowarNaPlanszy().remove(towar);
						Plansza.getNiewolnikNaPLanszy().setLicznikTowarow(Plansza.getNiewolnikNaPLanszy().getLicznikTowarow()+1);
						System.out.println("ZBIERAM Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
						i--;
						break;
					}
				
				if(Plansza.getRzemieslnikNaPlanszy().getXpolozenie()-1 <= towar.getXtowar() && Plansza.getRzemieslnikNaPlanszy().getXpolozenie()+1 >= towar.getXtowar()) 
					if(Plansza.getRzemieslnikNaPlanszy().getYpolozenie()-1 <= towar.getYtowar() && Plansza.getRzemieslnikNaPlanszy().getYpolozenie()+1 >= towar.getYtowar()) {
						Plansza.getRzemieslnikNaPlanszy().ZbieranieTowarow(towar);
						Plansza.getTowarNaPlanszy().remove(towar);
						Plansza.getRzemieslnikNaPlanszy().setLicznikTowarow(Plansza.getRzemieslnikNaPlanszy().getLicznikTowarow()+1);
						System.out.println("ZBIERAM Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
						i--;
						break;
					}
				
				if(Plansza.getArystokrataNaPlanszy().getXpolozenie()-1 <= towar.getXtowar() && Plansza.getArystokrataNaPlanszy().getXpolozenie()+1 >= towar.getXtowar()) 
					if(Plansza.getArystokrataNaPlanszy().getYpolozenie()-1 <= towar.getYtowar() && Plansza.getArystokrataNaPlanszy().getYpolozenie()+1 >= towar.getYtowar()) {
						Plansza.getArystokrataNaPlanszy().ZbieranieTowarow(towar);
						Plansza.getTowarNaPlanszy().remove(towar);
						Plansza.getArystokrataNaPlanszy().setLicznikTowarow(Plansza.getArystokrataNaPlanszy().getLicznikTowarow()+1);
						System.out.println("ZBIERAM Arystokrata: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
						i--;
						break;
					}
			}
		}
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
	}
	
	//Aktualizacja planszy w nowe towary i niebezpieczenstwa
	public void AktualizacjaPlanszy() {
		System.out.println("AktualizacjaPlanszy");
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		Plansza.setTowarNaPlanszy(new Towar(GeneratorRandom.RandomOd1(Plansza.getXplanszy()), GeneratorRandom.RandomOd1(Plansza.getYplanszy())));
		Plansza.setTowarNaPlanszy(new Towar(GeneratorRandom.RandomOd1(Plansza.getXplanszy()), GeneratorRandom.RandomOd1(Plansza.getYplanszy())));
		System.out.println();
		
		Plansza.setNiebezpieczenstwoNaPlanszy(new GenerujNiebezpieczenstwo(GeneratorRandom.RandomOd1(Plansza.getXplanszy()), GeneratorRandom.RandomOd1(Plansza.getYplanszy())));
		
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
	}
	
	//Aktualizacja populacji po handlu i zbieraniu towarow
	public void AktualizacjaPopulacjiKlas() {
		System.out.println("AktualizacjaPopulacjiKlas");
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		if(Plansza.getNiewolnikNaPLanszy().getJedzenie() >= Plansza.getNiewolnikNaPLanszy().getUbrania()) {
			Plansza.getNiewolnikNaPLanszy().setPopulacja(Plansza.getNiewolnikNaPLanszy().getUbrania());
		}
		else {
			Plansza.getNiewolnikNaPLanszy().setPopulacja(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		}
		
		if(Plansza.getRzemieslnikNaPlanszy().getNarzedzia() >= Plansza.getRzemieslnikNaPlanszy().getMaterialy()) {
			Plansza.getRzemieslnikNaPlanszy().setPopulacja(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		}
		else {
			Plansza.getRzemieslnikNaPlanszy().setPopulacja(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		}
		
		if(Plansza.getArystokrataNaPlanszy().getTowary() >= Plansza.getArystokrataNaPlanszy().getZloto()) {
			Plansza.getArystokrataNaPlanszy().setPopulacja(Plansza.getArystokrataNaPlanszy().getZloto());
		}
		else {
			Plansza.getArystokrataNaPlanszy().setPopulacja(Plansza.getArystokrataNaPlanszy().getTowary());
		}
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
	}
	
	public void Zabojstwa() {
		System.out.println("Zabojstwa");
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		for(int i=0;i<Plansza.getNiebezpieczenstwoNaPlanszy().size();i++) {
			for(GenerujNiebezpieczenstwo niebez : Plansza.getNiebezpieczenstwoNaPlanszy()) {
				int minusNiewolnik = niebez.getZabojca().ZmniejszIloscPopulacja(Plansza.getNiewolnikNaPLanszy());
				int minusRzemielsnik = niebez.getZabojca().ZmniejszIloscPopulacja(Plansza.getRzemieslnikNaPlanszy());
				int minusArystokrata = niebez.getZabojca().ZmniejszIloscPopulacja(Plansza.getArystokrataNaPlanszy());
				
				if(minusNiewolnik > 0) {
					Plansza.getNiewolnikNaPLanszy().setUbrania(Plansza.getNiewolnikNaPLanszy().getUbrania() - minusNiewolnik);
					Plansza.getNiewolnikNaPLanszy().setJedzenie(Plansza.getNiewolnikNaPLanszy().getJedzenie() - minusNiewolnik);
					Plansza.getNiebezpieczenstwoNaPlanszy().remove(niebez);
					i--;
					break;
				}
				
				if(minusRzemielsnik > 0) {
					Plansza.getRzemieslnikNaPlanszy().setNarzedzia(Plansza.getRzemieslnikNaPlanszy().getNarzedzia() - minusRzemielsnik);
					Plansza.getRzemieslnikNaPlanszy().setMaterialy(Plansza.getRzemieslnikNaPlanszy().getMaterialy() - minusRzemielsnik);
					Plansza.getNiebezpieczenstwoNaPlanszy().remove(niebez);
					i--;
					break;
				}
				
				if(minusArystokrata > 0) {
					Plansza.getNiewolnikNaPLanszy().setTowary(Plansza.getNiewolnikNaPLanszy().getTowary() - minusArystokrata);
					Plansza.getNiewolnikNaPLanszy().setZloto(Plansza.getNiewolnikNaPLanszy().getZloto() - minusArystokrata);
					Plansza.getNiebezpieczenstwoNaPlanszy().remove(niebez);
					i--;
					break;
				}
				
				
			}
		}
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
		
	}
	//Niesprawdzona metoda
	public void BudynkiNaPlanszy() {
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		System.out.println("BudynkiNaPlanszy");
		for(Towar towar : Plansza.getTowarNaPlanszy()) {
			Warsztat.WymanazajTowary(towar);
			Mennica.PlusTowary(towar);
		}
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
	}
	
	public boolean Wygrana() {
		System.out.println("Wygrana");
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		if(SprawdzanieWygranej.WygranaNiewolnikow()) {
			ZapisOdczyt.setWygranaKlasa(Plansza.getNiewolnikNaPLanszy());
			ZapisOdczyt.setWygranaKlasaPopulacja(Plansza.getNiewolnikNaPLanszy().getPopulacja());
			if(Plansza.getRzemieslnikNaPlanszy().getPopulacja() >= Plansza.getArystokrataNaPlanszy().getPopulacja()) {
				ZapisOdczyt.setMiejsce2(Plansza.getRzemieslnikNaPlanszy());
				ZapisOdczyt.setMiejsce2Populacja(Plansza.getRzemieslnikNaPlanszy().getPopulacja());
				ZapisOdczyt.setMiejsce3(Plansza.getArystokrataNaPlanszy());
				ZapisOdczyt.setMiejsce3Populacja(Plansza.getArystokrataNaPlanszy().getPopulacja());
			}
			else {
				ZapisOdczyt.setMiejsce2(Plansza.getArystokrataNaPlanszy());
				ZapisOdczyt.setMiejsce2Populacja(Plansza.getArystokrataNaPlanszy().getPopulacja());
				ZapisOdczyt.setMiejsce3(Plansza.getRzemieslnikNaPlanszy());
				ZapisOdczyt.setMiejsce3Populacja(Plansza.getRzemieslnikNaPlanszy().getPopulacja());
			}
			
			return true;
		}
		if(SprawdzanieWygranej.WygranaRzemieslnikow()) {
			ZapisOdczyt.setWygranaKlasa(Plansza.getRzemieslnikNaPlanszy());
			ZapisOdczyt.setWygranaKlasaPopulacja(Plansza.getRzemieslnikNaPlanszy().getPopulacja());
			if(Plansza.getNiewolnikNaPLanszy().getPopulacja() >= Plansza.getArystokrataNaPlanszy().getPopulacja()) {
				ZapisOdczyt.setMiejsce2(Plansza.getNiewolnikNaPLanszy());
				ZapisOdczyt.setMiejsce2Populacja(Plansza.getNiewolnikNaPLanszy().getPopulacja());
				ZapisOdczyt.setMiejsce3(Plansza.getArystokrataNaPlanszy());
				ZapisOdczyt.setMiejsce3Populacja(Plansza.getArystokrataNaPlanszy().getPopulacja());
			}
			else {
				ZapisOdczyt.setMiejsce2(Plansza.getArystokrataNaPlanszy());
				ZapisOdczyt.setMiejsce2Populacja(Plansza.getArystokrataNaPlanszy().getPopulacja());
				ZapisOdczyt.setMiejsce3(Plansza.getNiewolnikNaPLanszy());
				ZapisOdczyt.setMiejsce3Populacja(Plansza.getNiewolnikNaPLanszy().getPopulacja());
			}
			
			return true;
		}
		if(SprawdzanieWygranej.WygranaArystokracji()) {
			ZapisOdczyt.setWygranaKlasa(Plansza.getArystokrataNaPlanszy());
			ZapisOdczyt.setWygranaKlasaPopulacja(Plansza.getArystokrataNaPlanszy().getPopulacja());
			if(Plansza.getNiewolnikNaPLanszy().getPopulacja() >= Plansza.getRzemieslnikNaPlanszy().getPopulacja()) {
				ZapisOdczyt.setMiejsce2(Plansza.getNiewolnikNaPLanszy());
				ZapisOdczyt.setMiejsce2Populacja(Plansza.getNiewolnikNaPLanszy().getPopulacja());
				ZapisOdczyt.setMiejsce3(Plansza.getRzemieslnikNaPlanszy());
				ZapisOdczyt.setMiejsce3Populacja(Plansza.getRzemieslnikNaPlanszy().getPopulacja());
			}
			else {
				ZapisOdczyt.setMiejsce2(Plansza.getRzemieslnikNaPlanszy());
				ZapisOdczyt.setMiejsce2Populacja(Plansza.getRzemieslnikNaPlanszy().getPopulacja());
				ZapisOdczyt.setMiejsce3(Plansza.getNiewolnikNaPLanszy());
				ZapisOdczyt.setMiejsce3Populacja(Plansza.getNiewolnikNaPLanszy().getPopulacja());
			}
			
			return true;
		}
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
		
		return false;
	}
	
	public void AwansSpoleczny() {
		System.out.println("AwansSpoleczny");
		
		/*
		System.out.println("Niewolnik przedmioty");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		System.out.println("Rzemieslnik przedmioty");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Arystokrata przedmioty");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		*/
		
		if(Plansza.getNiewolnikNaPLanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()*0.67) {
			System.out.println("Awans Niewolnikow");
			Plansza.setNiewolnikNaPlanszy(new Mieszczanie(Plansza.getNiewolnikNaPLanszy()));
		}
			
		if(Plansza.getRzemieslnikNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()*0.67) {
			System.out.println("Awans Rzemieslnikow");
			Plansza.setRzemieslnikNaPlanszy(new Handlarze(Plansza.getRzemieslnikNaPlanszy()));
		}
			
		if(Plansza.getArystokrataNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()*0.67) {
			System.out.println("Awans Arystokracji");
			Plansza.setArystokrataNaPlanszy(new Szlachta(Plansza.getArystokrataNaPlanszy()));
		}
		
		System.out.println("Niewolnik: " + Plansza.getNiewolnikNaPLanszy().getPopulacja());
		System.out.println("Rzemieslnik: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja());
		System.out.println("Arystokratat: " + Plansza.getArystokrataNaPlanszy().getPopulacja());
	}
	/*
	public static void main(String[] args) throws IOException{
		Plansza pla = new Plansza(10, 11);
		Tura tura = new Tura();
		ZapisOdczyt odc = new ZapisOdczyt();
		odc.Odczyt();
		tura.AktualizacjaPlanszy();
		System.out.println("Polozenie: ");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getXpolozenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getYpolozenie());
		
		
		Plansza.getNiewolnikNaPLanszy().setJedzenie(10);
		Plansza.getNiewolnikNaPLanszy().setMaterialy(10);
		Plansza.getNiewolnikNaPLanszy().setNarzedzia(10);
		Plansza.getNiewolnikNaPLanszy().setTowary(10);
		Plansza.getNiewolnikNaPLanszy().setUbrania(10);
		Plansza.getNiewolnikNaPLanszy().setZloto(10);
		
		
		tura.ZbierzTowaryKlas();
		tura.HandelKlas();
		
		System.out.println("Po zebraniu: Niewolnik");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		
		System.out.println("Po zebraniu: Rzemieslnik");
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getJedzenie());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getMaterialy());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getTowary());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getUbrania());
		System.out.println(Plansza.getRzemieslnikNaPlanszy().getZloto());
		System.out.println("Po zebraniu: Arystokrata");
		System.out.println(Plansza.getArystokrataNaPlanszy().getJedzenie());
		System.out.println(Plansza.getArystokrataNaPlanszy().getMaterialy());
		System.out.println(Plansza.getArystokrataNaPlanszy().getNarzedzia());
		System.out.println(Plansza.getArystokrataNaPlanszy().getTowary());
		System.out.println(Plansza.getArystokrataNaPlanszy().getUbrania());
		System.out.println(Plansza.getArystokrataNaPlanszy().getZloto());
		
		
		//System.out.println(GenerujNiebezpieczenstwo.getXniebezpieczenstwo());
		//System.out.println(GenerujNiebezpieczenstwo.getYniebezpieczenstwo());
		//System.out.println(GenerujNiebezpieczenstwo.getZabojca().ZmniejszIloscPopulacja(Plansza.getNiewolnikNaPLanszy()));
		//2 generuje
		
		tura.AwansSpoleczny();
		tura.Wygrana();
		tura.AktualizacjaPopulacjiKlas();
		
		tura.Zabojstwa();
		
		System.out.println("Po zebraniu: Niewolnik po zabujstwach");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
	}
	*/
}