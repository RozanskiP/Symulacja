package Niebezpieczenstwo;

public class Bandyci implements Niebezpieczenstwo {
	
	public Bandyci(){
		System.out.println("Utworzona Bandyte");
	}
	
	@Override
	public int ZmniejszIloscPopulacja() {
		int a = GeneratorRandom.Random(2);
		return a;
	}
}
