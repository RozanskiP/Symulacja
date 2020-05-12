package RandomoweLiczby;

import java.util.Random;
//Generator losowych liczb w roznych zakresach
public class GeneratorRandom {
	
	private static final int ZiarnoGeneratora = 47;
	
	//Generator losowych liczb od 1 do Zakres
	public static int RandomOd1Losowe(int Zakres) {
		Random rand = new Random();
		int a = rand.nextInt(Zakres)+1;
		
		return a;
	}
	
	//Generator losowy liczb od 0 do Zakres
	public static int RandomOd0Losowe(int Zakres) {
		Random rand = new Random();
		int a = rand.nextInt(Zakres);
		
		return a;
	}
	
	//Generator losowych liczb od 1 do Zakres
		public static int RandomOd1(int Zakres) {
			Random rand = new Random(ZiarnoGeneratora);
			int a = rand.nextInt(Zakres)+1;
			
			return a;
	}
		
	//Generator losowy liczb od 0 do Zakres
	public static int RandomOd0(int Zakres) {
		Random rand = new Random(ZiarnoGeneratora);
		int a = rand.nextInt(Zakres);
		
		return a;
	}
}
