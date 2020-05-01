package RandomoweLiczby;

import java.util.Random;
//Generator losowych liczb w roznych zakresach
public class GeneratorRandom {
	//Generator losowych liczb od 1 do Zakres
	
	//private static int ZiarnoGeneratoradoTestow= 40;
	
	public static int RandomOd1(int Zakres) {
		Random rand = new Random();
		int a = rand.nextInt(Zakres)+1;
		
		return a;
	}
	//Generator losowy liczb od 0 do Zakres
	public static int RandomOd0(int Zakres) {
		Random rand = new Random();
		int a = rand.nextInt(Zakres);
		
		return a;
	}
	
	public static void main(String[] args) {
		for(int i =0 ;i <10;i++) {
			int a = GeneratorRandom.RandomOd1(3);
			System.out.println(a);
		}
	}
	
}
