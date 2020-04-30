package Budynki;

public abstract class Budynek {
	protected static int XBudynek;
	protected static int YBudynek;
	
	public Budynek(int X, int Y) {
		XBudynek = X;
		YBudynek = Y;
	}
	
	public int getXBudynek() { return XBudynek; }
	public int getYBudynek() { return YBudynek; }
}
