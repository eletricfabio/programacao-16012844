import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// 2- Faça um Programa que leia três números e mostre o maior e o menor deles.
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		float num1 = s.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float num2 = s.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		float num3 = s.nextFloat();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("\nA é o maior: " + num1);
		if (num2 < num3) {
			System.out.println("\nB é o menor: " + num2);
		} else 
			System.out.println("\nC é o menor: " + num3);
			
		} else 
			if (num2 > num1 && num2 > num3) {
				System.out.println("\nB é o maior: " + num2);
			if (num1 < num3) {
				System.out.println("\nA é o menor: " + num1);
			} else 
				System.out.println("\nC é o menor: " + num3);
		} else
			if (num3 > num1 && num3 > num2) {
				System.out.println("\nC é o maior: " + num3);
			if (num2 < num1) {
				System.out.println("\nB é o menor: " + num2);
			} else 
				System.out.println("\nA é o menor: " + num1);
		} else
			if (num1 == num2 || num2 == num3) {
				System.out.println("\nTodos são iguais! ");
		}
	}
}
