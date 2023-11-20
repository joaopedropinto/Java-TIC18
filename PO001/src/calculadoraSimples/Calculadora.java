package calculadoraSimples;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args){
		double num1, num2, total; 
		int opcao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextDouble();
		
		System.out.println("Selecione uma operação aritmética: ");
		System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        opcao = sc.nextInt();
        
        switch(opcao) {
        case 1:
        	total = num1 + num2;
        	break;
        case 2:
        	total = num1 - num2;
        	break;
        case 3:
        	total = num1 * num2;
        	break;
        case 4:
        	if(num2 == 0) {
        		System.out.println("Divisão por zero!!");
        		return;
        	}else {
        		total = num1 / num2;
        	}
        default:
        	System.out.println("Opção inválida!");
        	return;
        }
        System.out.println("O resultado da operação é: " + total);
	}
}
