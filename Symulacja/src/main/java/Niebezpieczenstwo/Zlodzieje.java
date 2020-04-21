package Niebezpieczenstwo;

public class Zlodzieje implements Niebezpieczenstwo {

	public Zlodzieje() {
		System.out.println("Utworzona Zlodzieja");
	}
	
	@Override
	public int ZmniejszIloscPopulacja() {
		int a = GeneratorRandom.Random(2);
		return a;
	}
}
