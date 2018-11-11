import java.util.Scanner;

public class Aula9 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. 
		// O programa dever� informar se os valores podem ser um tri�ngulo. 
		// Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
		// Dicas:
		// * Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
		// * Tri�ngulo Equil�tero: tr�s lados iguais;
		// * Tri�ngulo Is�sceles: quaisquer dois lados iguais;
		// * Tri�ngulo Escaleno: tr�s lados diferentes;
		Scanner lado = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Informe o primeiro n�mero: ");
		n1 = lado.nextInt();
		
		System.out.println("Informe o segundoo n�mero: ");
		n2 = lado.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		n3 = lado.nextInt();
		
		if ((n1 == n2) && (n2 == n3)) {
				System.out.println("O tri�ngulo � Equil�tero");
			} else {
		if ((n1 == n2) && (n2 != n3) || (n1 != n2) && (n2 == n3) && (n1 == n2) || (n1 != n2) && (n1 == n3)) {
				System.out.println("O tri�ngulo � Is�celes");
		} else
		if ((n1 != n2) && (n1 != n3)) {
				System.out.println("O tri�ngulo � Escaleno");
			}
		}
	} 
} 