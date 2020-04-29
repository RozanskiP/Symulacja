package Zarzadzanie;

import java.io.IOException;

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
		Plansza.getNiewolnikNaPLanszy().Handel(Plansza.getRzemieslnikNaPlanszy());
		Plansza.getNiewolnikNaPLanszy().Handel(Plansza.getArystokrataNaPlanszy());
		
		Plansza.getRzemieslnikNaPlanszy().Handel(Plansza.getNiewolnikNaPLanszy());
		Plansza.getRzemieslnikNaPlanszy().Handel(Plansza.getArystokrataNaPlanszy());
		
		Plansza.getArystokrataNaPlanszy().Handel(Plansza.getNiewolnikNaPLanszy());
		Plansza.getArystokrataNaPlanszy().Handel(Plansza.getRzemieslnikNaPlanszy());
	}
	
	public void ZbierzTowaryKlas() {
		for(int i=0;i<Plansza.getTowarNaPlanszy().size();i++) {
			for(Towar towar : Plansza.getTowarNaPlanszy()) {
				if(Plansza.getNiewolnikNaPLanszy().getXpolozenie()-1 <= towar.getXtowar() && Plansza.getNiewolnikNaPLanszy().getXpolozenie()+1 >= towar.getXtowar()) 
					if(Plansza.getNiewolnikNaPLanszy().getYpolozenie()-1 <= towar.getYtowar() && Plansza.getNiewolnikNaPLanszy().getYpolozenie()+1 >= towar.getYtowar()) {
						Plansza.getNiewolnikNaPLanszy().ZbieranieTowarow(towar);
						System.out.println("ZBIERAM Niewolnik");
						Plansza.getTowarNaPlanszy().remove(towar);
						i--;
						break;
					}
				
				if(Plansza.getRzemieslnikNaPlanszy().getXpolozenie()-1 <= towar.getXtowar() && Plansza.getRzemieslnikNaPlanszy().getXpolozenie()+1 >= towar.getXtowar()) 
					if(Plansza.getRzemieslnikNaPlanszy().getYpolozenie()-1 <= towar.getYtowar() && Plansza.getRzemieslnikNaPlanszy().getYpolozenie()+1 >= towar.getYtowar()) {
						Plansza.getRzemieslnikNaPlanszy().ZbieranieTowarow(towar);
						System.out.println("ZBIERAM Rzemieslnik");
						Plansza.getTowarNaPlanszy().remove(towar);
						i--;
						break;
					}
				
				if(Plansza.getArystokrataNaPlanszy().getXpolozenie()-1 <= towar.getXtowar() && Plansza.getArystokrataNaPlanszy().getXpolozenie()+1 >= towar.getXtowar()) 
					if(Plansza.getArystokrataNaPlanszy().getYpolozenie()-1 <= towar.getYtowar() && Plansza.getArystokrataNaPlanszy().getYpolozenie()+1 >= towar.getYtowar()) {
						Plansza.getArystokrataNaPlanszy().ZbieranieTowarow(towar);
						System.out.println("ZBIERAM Arystokrata");
						Plansza.getTowarNaPlanszy().remove(towar);
						i--;
						break;
					}
			
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
		System.out.println("POPULACJAMAX: " + ZapisOdczyt.getPOPULACJAMAX());
		if(Plansza.getNiewolnikNaPLanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			System.out.println("Awans Niewolnikow");
			Plansza.setNiewolnikNaPlanszy(new Mieszczanie(Plansza.getNiewolnikNaPLanszy()));
		}
			
		if(Plansza.getRzemieslnikNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			System.out.println("Awans Rzemieslnikow");
			Plansza.setRzemieslnikNaPlanszy(new Handlarze(Plansza.getRzemieslnikNaPlanszy()));
		}
			
		if(Plansza.getArystokrataNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			System.out.println("Awans Arystokracji");
			Plansza.setArystokrataNaPlanszy(new Szlachta(Plansza.getArystokrataNaPlanszy()));
		}
	}
	
	public static void main(String[] args) throws IOException{
		Plansza pla = new Plansza(10, 11);
		Tura tura = new Tura();
		ZapisOdczyt odc = new ZapisOdczyt();
		odc.Odczyt();
		pla.setTowarNaPlanszy(new Towar(3,7));
		pla.setTowarNaPlanszy(new Towar(3,7));
		pla.setTowarNaPlanszy(new Towar(3,8));
		pla.setTowarNaPlanszy(new Towar(3,7));
		pla.setTowarNaPlanszy(new Towar(3,8));
		System.out.println("Polozenie: ");
		System.out.println(Plansza.getNiewolnikNaPLanszy().getXpolozenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getYpolozenie());
		System.out.println();
		System.out.println(Plansza.getNiewolnikNaPLanszy().getJedzenie());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getMaterialy());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getNarzedzia());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getTowary());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getUbrania());
		System.out.println(Plansza.getNiewolnikNaPLanszy().getZloto());
		
		
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
		
		tura.AwansSpoleczny();
		
	}
	
}
