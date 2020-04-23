package Budynki;

public abstract class Budynek {
	private int XBudynek;
	private int YBudynek;
	
	public Budynek(int X, int Y) {
		this.XBudynek = X;
		this.YBudynek = Y;
	}
	
	public int getXBudynek() { return XBudynek; }
	public int getYBudynek() { return YBudynek; }
}
