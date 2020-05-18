package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;

import Zarzadzanie.Main;
import Zarzadzanie.ZapisOdczyt;


public class Symulacja {

	public Dimension dim;
	public JFrame jframe;
	public static RenderPanel renderPanel;
	
	public Symulacja() throws IOException{
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		jframe = new JFrame("Symulacja");
		jframe.setVisible(true);
		//jframe.setSize(1250, 900);
		jframe.setSize(1135,820);
		jframe.setResizable(false);
		jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);
		jframe.add(renderPanel = new RenderPanel());
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main.main();
	}
	
	public static void main(String[] args)  throws IOException  {
		Symulacja sum = new Symulacja();
	}

}