import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// 2- Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		float num1 = s.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float num2 = s.nextFloat();
		
		System.out.println("Digite o terceiro n�mero: ");
		float num3 = s.nextFloat();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("\nA � o maior: " + num1);
		if (num2 < num3) {
			System.out.println("\nB � o menor: " + num2);
		} else 
			System.out.println("\nC � o menor: " + num3);
			
		} else 
			if (num2 > num1 && num2 > num3) {
				System.out.println("\nB � o maior: " + num2);
			if (num1 < num3) {
				System.out.println("\nA � o menor: " + num1);
			} else 
				System.out.println("\nC � o menor: " + num3);
		} else
			if (num3 > num1 && num3 > num2) {
				System.out.println("\nC � o maior: " + num3);
			if (num2 < num1) {
				System.out.println("\nB � o menor: " + num2);
			} else 
				System.out.println("\nA � o menor: " + num1);
		} else
			if (num1 == num2 || num2 == num3) {
				System.out.println("\nTodos s�o iguais! ");
		}
	}
}
