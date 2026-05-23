import java.util.Scanner;

public class AprendeNovidades {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite outro numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Soma de " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("Divisão de " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("Multiplicação de " + num1 + " X " + num2 + " = " + (num1 * num2));
		System.out.println("Subtração de " + num1 + " - " + num2 + " = "  + (num1 - num2));
	}
}
