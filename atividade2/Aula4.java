import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem decrescente.
		Scanner descres = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Informe o primeiro número: ");
		n1 = descres.nextInt();
		
		System.out.println("Informe o segundoo número: ");
		n2 = descres.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		n3 = descres.nextInt();
		
		if (n1 > n2 && n1 > n3) {

			if (n2 > n3) {
				System.out.println("A ordem é: " + n1 + "," + n2 + "," + n3);
			} else 
				System.out.println("A ordem é: " + n1 + "," + n3 + "," + n2);
				
			} else
			if (n2 > n1 && n2 > n3) {
				if (n3 > n1) {
					System.out.println("A ordem é: " + n2 + "," + n3 + "," + n1);
			} else 
					System.out.println("A ordem é: " + n2 + "," + n1 + "," + n3);
					
			} else
				if (n3 > n1 && n3 > n2) {
					if (n2 > n1) {
						System.out.println("A ordem é: " + n3 + "," + n2 + "," + n1);
					} else
						System.out.println("A ordem é: " + n3 + "," + n1 + "," + n2);
		}
	}
}
