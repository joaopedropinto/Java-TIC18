package po002;

import java.util.Scanner;

public class ConversorMoedas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n=== Conversor de Moedas ===\n");
		System.out.println("Insira a taxa de câmbio: ");
		float taxa = sc.nextFloat();
		System.out.println("Insira a quantidade em dólares: ");
		float dol = sc.nextFloat();
		float resul = taxa * dol;
		System.out.println("Valor convertido: " + resul);
	}
}
