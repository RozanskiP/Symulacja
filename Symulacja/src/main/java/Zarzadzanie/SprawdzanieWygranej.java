package Zarzadzanie;

public class SprawdzanieWygranej {

	public static boolean WygranaNiewolnikow() {
		if(Plansza.getNiewolnikNaPLanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean WygranaRzemieslnikow() {
		if(Plansza.getRzemieslnikNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean WygranaArystokracji() {
		if(Plansza.getArystokrataNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	public static void main(String [] args) throws IOException{
		ZapisOdczyt odcz = new ZapisOdczyt();
		odcz.Odczyt();
		Plansza obj = new Plansza(odcz.getWielkoscPlanszyX(),odcz.getWielkoscPlanszyY());
		
		SprawdzanieWygranej spr = new SprawdzanieWygranej();
		
		System.out.println(spr.WygranaNiewolnikow());
	}
	*/
}
