import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		// 4- Entrar com um n�mero e imprimir a seguinte sa�da:
		// NUMERO:
		// QUADRADO:
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double num = s.nextDouble();
		
		System.out.println("Voc� digitou o n�mero: " + num);
		System.out.println("O quadrado deste n�mero �: " + num*2);
		
	}

}
