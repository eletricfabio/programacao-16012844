import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// 1- Fa�a um algoritmo para ler dois n�meros inteiros A e B e informar se A � divis�vel por B.
		Scanner s = new Scanner(System.in);
		int num1, num2;
		
		do {
			System.out.println("Digite um n�mero inteiro (A): ");
			num1 = s.nextInt();
			
			System.out.println("Digite outro n�mero inteiro (B): ");
			num2 = s.nextInt();
		} while (num1 == 0 || num2 == 0);
	
		int result = (num1%num2);
		
		if (result == 0) {
			System.out.printf("\nA � divis�vel por B: " + result);
		} else {
			System.out.printf("\nA n�o � divis�vel por B: ");
		}
	}
}