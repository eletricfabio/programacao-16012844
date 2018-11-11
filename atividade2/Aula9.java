import java.util.Scanner;

public class Aula9 {

	public static void main(String[] args) {
		// Faça um Programa que peça os 3 lados de um triângulo. 
		// O programa deverá informar se os valores podem ser um triângulo. 
		// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
		// Dicas:
		// * Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
		// * Triângulo Equilátero: três lados iguais;
		// * Triângulo Isósceles: quaisquer dois lados iguais;
		// * Triângulo Escaleno: três lados diferentes;
		Scanner lado = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Informe o primeiro número: ");
		n1 = lado.nextInt();
		
		System.out.println("Informe o segundoo número: ");
		n2 = lado.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		n3 = lado.nextInt();
		
		if ((n1 == n2) && (n2 == n3)) {
				System.out.println("O triângulo é Equilátero");
			} else {
		if ((n1 == n2) && (n2 != n3) || (n1 != n2) && (n2 == n3) && (n1 == n2) || (n1 != n2) && (n1 == n3)) {
				System.out.println("O triângulo é Isóceles");
		} else
		if ((n1 != n2) && (n1 != n3)) {
				System.out.println("O triângulo é Escaleno");
			}
		}
	} 
} 