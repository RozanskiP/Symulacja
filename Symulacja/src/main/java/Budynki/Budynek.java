package Budynki;

public abstract class Budynek {
	private static int XBudynek;
	private static int YBudynek;
	
	public Budynek(int X, int Y) {
		XBudynek = X;
		YBudynek = Y;
	}
	
	public static int getXBudynek() { return XBudynek; }
	public static int getYBudynek() { return YBudynek; }
}
