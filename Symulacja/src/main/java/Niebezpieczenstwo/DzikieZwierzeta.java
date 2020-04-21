package Niebezpieczenstwo;

public class DzikieZwierzeta implements Niebezpieczenstwo {
	
	public DzikieZwierzeta() {
		System.out.println("Utworzona DzikieZwierzeta");
	}
	
	@Override
	public int ZmniejszIloscPopulacja() {
		int a = GeneratorRandom.Random(2);
		return a;
	}
}
