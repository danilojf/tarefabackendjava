import java.util.Scanner;

public class MetodosCalculando {
	public static int somaNumeros (int a, int b) {
		return a + b;
		}
	public static int subtraiNumeros (int a, int b) {
		return a - b;
	}
	public static int multiplicaNumeros (int a, int b) {
		return a * b;
	}
	public static int divideNumeros (int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("** Calculadora **");
		System.out.println("Digite 1 - Soma");
		System.out.println("Digite 2 - Subtração");
		System.out.println("Digite 3 - Divisão");
		System.out.println("Digite 4 - Multiplicação");
		int scan = entrada.nextInt();
		System.out.println("Digite um numero: ");
		int numb1 = entrada.nextInt();
		System.out.println("Digite um numero: ");
		int numb2 = entrada.nextInt();
		
		switch (scan) {
		case 1 -> System.out.println(somaNumeros(numb1, numb2));
		case 2 -> System.out.println(subtraiNumeros(numb1, numb2));
		case 3 -> System.out.println(multiplicaNumeros(numb1, numb2));
		case 4 -> System.out.println(divideNumeros(numb1, numb2));
		default -> System.out.println("Operação Inválida");
		}
		entrada.close();
	}
}
