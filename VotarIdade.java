import java.util.Scanner;

public class VotarIdade {
	public static void main(String[] args) {
		Scanner eleicao = new Scanner(System.in);
		int idadeMin = 16;
		int idadeObrigatoria = 18;
		System.out.println("Qual sua idade? ");
		int idadePessoa = eleicao.nextInt();
		
		if (idadePessoa >= idadeMin && idadePessoa <= 17) {
			System.out.println("Você já pode votar, se quiser criar seu titulo");
		}
		else if (idadePessoa >= idadeObrigatoria) {
			System.out.println("Não esqueça de votar, apartir dos 18 anos é a idade Obrigatória");
		}
		else {
			System.out.println("Você não tem idade para votar ainda, Obrigado");
		}
		eleicao.close();
	}
}
