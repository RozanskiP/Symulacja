package Niebezpieczenstwo;

import java.util.Random;
//Generator losowych liczb od 1 do Zakres
public class GeneratorRandom {
	public static int Random(int Zakres) {
		Random rand = new Random();
		int a = rand.nextInt(Zakres)+1;
		
		return a;
	}
}
