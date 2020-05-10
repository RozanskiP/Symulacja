package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import KlasaSpoleczna.KlasaSpoleczna;
import Niebezpieczenstwo.GenerujNiebezpieczenstwo;
import Towar.Towar;
import Zarzadzanie.*;

public class RenderPanel extends JPanel{
	
	public static final Color GREEN= new Color(1666073);
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		KlasaSpoleczna niewolnik = Plansza.getNiewolnikNaPLanszy();
		KlasaSpoleczna rzemieslnik = Plansza.getRzemieslnikNaPlanszy();
		KlasaSpoleczna arystokrata = Plansza.getArystokrataNaPlanszy();
		
		g.setColor(GREEN);
		g.fillRect(0, 0, Plansza.getXplanszy()*12, Plansza.getYplanszy()*12);
		
		g.setColor(Color.BLUE);
		g.fillRect(niewolnik.getXpolozenie()*11, niewolnik.getYpolozenie()*11, 10, 10);
		
		g.setColor(Color.YELLOW);
		g.fillRect(rzemieslnik.getXpolozenie()*11, rzemieslnik.getYpolozenie()*11, 10, 10);
		
		g.setColor(Color.BLACK);
		g.fillRect(arystokrata.getXpolozenie()*11, arystokrata.getYpolozenie()*11, 10, 10);
		
		g.setColor(Color.WHITE);
		for(Towar towar : Plansza.getTowarNaPlanszy()) {
			g.fillRect(towar.getXtowar()*11, towar.getYtowar()*11, 2, 2);
		}
		
		g.setColor(Color.BLACK);
		g.fillRect(Plansza.getWarsztatNaPlanszy().getXBudynek()*11, Plansza.getWarsztatNaPlanszy().getYBudynek()*11, 15, 15);
		g.fillRect(Plansza.getMennicaNaPlanszy().getXBudynek()*11, Plansza.getMennicaNaPlanszy().getYBudynek()*11, 15, 15);
		
		g.setColor(Color.RED);
		for(GenerujNiebezpieczenstwo niebez : Plansza.getNiebezpieczenstwoNaPlanszy()) {
			g.fillRect(niebez.getXniebezpieczenstwo()*11, niebez.getYniebezpieczenstwo()*11, 2, 2);
		}
		
		String string = "Tura: " + Tura.getLicznikTur() + ", Populacja   Niewolnicy:" + Plansza.getNiewolnikNaPLanszy().getPopulacja() + ", Rzemieslnicy: " + Plansza.getRzemieslnikNaPlanszy().getPopulacja() + ", Arystokracja :" + Plansza.getArystokrataNaPlanszy().getPopulacja();
		
		g.setColor(Color.white);
		
		g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), 30);
		
		
		if(Tura.Wygrana()) {
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, Plansza.getXplanszy()*12, Plansza.getYplanszy()*12);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
			g.drawString("VICTORY of: " + ZapisOdczyt.getWygranaKlasa(), Plansza.getXplanszy(), Plansza.getYplanszy()*5);
		}
		
		
	}
}
