import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.
		Scanner descres = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Informe o primeiro n�mero: ");
		n1 = descres.nextInt();
		
		System.out.println("Informe o segundoo n�mero: ");
		n2 = descres.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		n3 = descres.nextInt();
		
		if (n1 > n2 && n1 > n3) {

			if (n2 > n3) {
				System.out.println("A ordem �: " + n1 + "," + n2 + "," + n3);
			} else 
				System.out.println("A ordem �: " + n1 + "," + n3 + "," + n2);
				
			} else
			if (n2 > n1 && n2 > n3) {
				if (n3 > n1) {
					System.out.println("A ordem �: " + n2 + "," + n3 + "," + n1);
			} else 
					System.out.println("A ordem �: " + n2 + "," + n1 + "," + n3);
					
			} else
				if (n3 > n1 && n3 > n2) {
					if (n2 > n1) {
						System.out.println("A ordem �: " + n3 + "," + n2 + "," + n1);
					} else
						System.out.println("A ordem �: " + n3 + "," + n1 + "," + n2);
		}
	}
}
