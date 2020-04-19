package Symulacja;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author imssbora
 *
 */
public class MainAppTest {

   @Test
   public void testSayHello() {
      MainApp app = new MainApp();
      assertNotNull("Success", app.sayHello());
   }
}