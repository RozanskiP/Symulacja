package Budynki;

//Abstrakcyjna klasa Budynek z mo¿liwoœcia pogrania po³o¿enia X i Y
public abstract class Budynek {
	//chronione zmienne X i Y
	protected static int XBudynek;
	protected static int YBudynek;
	
	//Konstruktor Klasy Budynek
	public Budynek(int X, int Y) {
		XBudynek = X;
		YBudynek = Y;
	}
	//Getery X i Y
	public int getXBudynek() { return XBudynek; }
	public int getYBudynek() { return YBudynek; }
}
