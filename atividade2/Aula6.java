import java.util.Scanner;

public class Aula6 {

	public static void main(String[] args) {
		// 6- Crie um programa que receba o nome de um produto, seu pre�o e a condi��o de pagamento (� vista / a prazo).
		//Se o pagamento for � vista o cliente dever� ter um desconto de 5%, se for a prazo um juro de 2%.
		Scanner s = new Scanner(System.in);
		
		String produto;
		
		System.out.println("Escolha o produto, exemplo: Ma�a / Uva / Pera: ");
		produto = s.next();
		
		int p, v, t;
		
		System.out.println("Informe o pre�o do item: ");
		v = s.nextInt();
		
		System.out.println("Informe o tipo de pagamento: (1) � vista desconto de 5% ; (2) � prazo juros de 2%. ");
		t = s.nextInt();
		
		System.out.println("---------------------------------");
		
		double result1 = (v-(0.5));
		
		double result2 = (v-(0.2));
		
		if (t == 1 && t == 2 ) {
			System.out.print("Sua compra teve desconto de 5%: " + result1);
		} else {
			System.out.print("Sua compra teve juros de 2%: " + result2);
		}
	}

}
