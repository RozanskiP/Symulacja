package KlasaSpoleczna;

public abstract class KlasaSpoleczna {
	private int Populacja;
	private int DodatkowaPopulacjaPrzyAwansie;
	private int Xpolozenie;
	private int Ypolozenie;
	
	public void Ruch(int NoweX, int NoweY) {
		this.Xpolozenie = NoweX;
		this.Ypolozenie = NoweY;
	}
	public void Handel() { }
	public void ZbieranieTowarow() { }
	public int getPopulacja() { return this.Populacja; }
	public void setPopulacja(int Populacja) { this.Populacja = Populacja; }
	public int getXpolozenie() { return this.Xpolozenie; }
	public void setXpolozenie(int Xpolozenie) { this.Xpolozenie = Xpolozenie; }
	public int getYpolozenie() { return this.Ypolozenie; }
	public void setYpolozenie(int Ypolozenie) { this.Ypolozenie = Ypolozenie; }
}
