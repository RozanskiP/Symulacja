package Zarzadzanie;

//Klasa sprawdzajaca czy ktora z KlasSpolecznych wygra³a
public class SprawdzanieWygranej {

	//Metoda dla Niewolnikow zwracajaca true jesli Populacja przekroczyla zadana liczbe
	public static boolean WygranaNiewolnikow() {
		if(Plansza.getNiewolnikNaPLanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metoda dla Rzemieslnikow zwracajaca true jesli Populacja przekroczyla zadana liczbe
	public static boolean WygranaRzemieslnikow() {
		if(Plansza.getRzemieslnikNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metoda dla Arystokracji zwracajaca true jesli Populacja przekroczyla zadana liczbe
	public static boolean WygranaArystokracji() {
		if(Plansza.getArystokrataNaPlanszy().getPopulacja() >= ZapisOdczyt.getPOPULACJAMAX()) {
			return true;
		}
		else {
			return false;
		}
	}
}
