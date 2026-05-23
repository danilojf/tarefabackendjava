import java.util.Scanner;

public class SaberPar {

	public static boolean ehPar (int num) {
		return num % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner resultado = new Scanner(System.in);
		System.out.println("Deseja saber qual numero é par? ");
		int numbPar = resultado.nextInt();	
		
		if (ehPar(numbPar)) {
		System.out.println("Este número é Par");
		}
		else {
			System.out.println("Este Número é impar");
		}
  resultado.close();
	}	
}
