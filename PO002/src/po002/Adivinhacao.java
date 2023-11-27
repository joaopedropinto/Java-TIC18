package po002;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int num = random.nextInt(100) + 1;
		int tentativa;
		
		System.out.println("=== Jogo de adivinhação ===");
		System.out.println("Tente adivinhar qual o número entre 1 e 100");
		do {
			System.out.println("Digite sua tentativa (0 para sair): ");
			tentativa = sc.nextInt();
			if(tentativa == num) {
				System.out.println("Parabéns, você acertou!");
			}else if(tentativa == 0) {
				System.out.println("Saindo do programa...");
				return;
			}else if(tentativa < num) {
				System.out.println("Tente novamente. O número sorteado é maior que o atual.");
			}else if(tentativa > num) {
				System.out.println("Tente novamente. O número sorteado é menor que o atual.");
			}
		}while(tentativa != num);
	}
}
