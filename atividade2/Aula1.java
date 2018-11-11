import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// 1- Faça um algoritmo para ler dois números inteiros A e B e informar se A é divisível por B.
		Scanner s = new Scanner(System.in);
		int num1, num2;
		
		do {
			System.out.println("Digite um número inteiro (A): ");
			num1 = s.nextInt();
			
			System.out.println("Digite outro número inteiro (B): ");
			num2 = s.nextInt();
		} while (num1 == 0 || num2 == 0);
	
		int result = (num1%num2);
		
		if (result == 0) {
			System.out.printf("\nA É divisível por B: " + result);
		} else {
			System.out.printf("\nA não é divisível por B: ");
		}
	}
}