import java.util.Scanner;

public class Aula6 {

	public static void main(String[] args) {
		// 6- Fa�a um algoritmo que possa entrar com o saldo de sua caderneta de poupan�a e
		// imprima o novo saldo que teve reajuste de 3%.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ol�, digite o saldo da sua caderneta de poupan�a: ");
		double num = s.nextDouble();
		
		double rend = (num*0.03);
		System.out.println("O rendimento mensal de 3%: " + "R$" + rend);
		
		double saldo = (num+rend);
		System.out.println("O saldo mensal atualizado �: " + "R$" + saldo);
		
	}

}
