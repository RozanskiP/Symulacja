package Tests;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

import Zarzadzanie.*;

public class TestZarzadzanie {

	@Test
	public void testZapisOdczyt() throws IOException  {
		ZapisOdczyt zapodc = new ZapisOdczyt();
		zapodc.Odczyt();
		
		assertTrue(zapodc.getWielkoscPlanszyX() > 0);
		assertTrue(zapodc.getWielkoscPlanszyY() > 0);
		assertTrue(ZapisOdczyt.getNiewolnicySzansa() >= 0);
		assertTrue(ZapisOdczyt.getRzemieslnicySzansa() >= 0);
		assertTrue(ZapisOdczyt.getArystokracjaWiekszaPopulacja() >= 0);
		assertTrue(ZapisOdczyt.getPopulacjaStartowaArystokracja() > 0);
		assertTrue(ZapisOdczyt.getPopulacjaStartowaNiewolnicy() > 0);
		assertTrue(ZapisOdczyt.getPopulacjaStartowaRzemieslnicy() > 0);
		assertTrue(ZapisOdczyt.getPOPULACJAMAX() > 0);
	}

}
