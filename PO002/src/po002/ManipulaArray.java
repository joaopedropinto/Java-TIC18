package po002;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ManipulaArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do array:");
        int tam = sc.nextInt();
        
        int[] arrayUsuario = criarArrayUsuario(tam);
        int[] arrayAleatorio = criarArrayAleatorio(tam);
        System.out.println("Array do Usuário: " + Arrays.toString(arrayUsuario));
        System.out.println("Array Aleatório: " + Arrays.toString(arrayAleatorio));
        
        int somaUsuario = calcularSoma(arrayUsuario);
        int somaAleatorio = calcularSoma(arrayAleatorio);
        int maiorUsuario = encontrarMaiorValor(arrayUsuario);
        int maiorAleatorio = encontrarMaiorValor(arrayAleatorio);
        int menorUsuario = encontrarMenorValor(arrayUsuario);
        int menorAleatorio = encontrarMenorValor(arrayAleatorio);
        
        System.out.println("Soma do Array do Usuário: " + somaUsuario);
        System.out.println("Soma do Array aleatório: " + somaAleatorio);

        System.out.println("Maior valor do Array do Usuário: " + maiorUsuario);
        System.out.println("Maior valor do Array aleatório: " + maiorAleatorio);

        System.out.println("Menor valor do Array do Usuário: " + menorUsuario);
        System.out.println("Menor valor do Array aleatório: " + menorAleatorio);
	}
	
	public static int[] criarArrayUsuario(int tam) {
	    Scanner sc = new Scanner(System.in);
	    int[] array = new int[tam];
	    System.out.println("Informe os elementos do array:");

	    for (int i = 0; i < tam; i++) {
	        System.out.print("Elemento " + (i + 1) + ": ");
	        array[i] = sc.nextInt();
	    }
	    return array;
	}
	
	public static int[] criarArrayAleatorio(int tam) {
        Random random = new Random();
        int[] array = new int[tam];

        for (int i = 0; i < tam; i++) {
            array[i] = random.nextInt(100); 
        }
        return array;
    }
	
	public static int calcularSoma(int[] array) {
        int soma = 0;
        
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }
	
	public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        
        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }
	
	public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        
        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

}
