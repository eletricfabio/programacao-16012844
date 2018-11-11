import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		// 3- Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
		// sabendo que a decisão é sempre pelo mais barato.
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto A");
		int p1 = s.nextInt();
		
		System.out.println("Digite o valor do produto B");
		int p2 = s.nextInt();
		
		System.out.println("Digite o valor do produto C");
		int p3 = s.nextInt();
		
		if (p1 <= p2 && p1 <= p3) {
			System.out.println("\nA é o produto mais barato: " + p1);
		}
		if (p2 <= p1 && p2 <= p3) {
			System.out.println("\nB é o produto mais barato: " + p2);
		}
		if (p3 <= p1 && p3 <= p2) {
			System.out.println("\nC é o produto mais barato: " + p3);
		 }
	}
}
