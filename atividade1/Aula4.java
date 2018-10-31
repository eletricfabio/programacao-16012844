import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		// 4- Entrar com um número e imprimir a seguinte saída:
		// NUMERO:
		// QUADRADO:
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = s.nextDouble();
		
		System.out.println("Você digitou o número: " + num);
		System.out.println("O quadrado deste número é: " + num*2);
		
	}

}
