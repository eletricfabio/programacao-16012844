import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		// 3- Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, 
		// sabendo que a decis�o � sempre pelo mais barato.
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto A");
		int p1 = s.nextInt();
		
		System.out.println("Digite o valor do produto B");
		int p2 = s.nextInt();
		
		System.out.println("Digite o valor do produto C");
		int p3 = s.nextInt();
		
		if (p1 <= p2 && p1 <= p3) {
			System.out.println("\nA � o produto mais barato: " + p1);
		}
		if (p2 <= p1 && p2 <= p3) {
			System.out.println("\nB � o produto mais barato: " + p2);
		}
		if (p3 <= p1 && p3 <= p2) {
			System.out.println("\nC � o produto mais barato: " + p3);
		 }
	}
}
