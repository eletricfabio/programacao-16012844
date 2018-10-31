import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		//3- Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		// Calcule e mostre o total do seu salário no referido mês.

		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá, Quanto você quanha em reais(R$) por hora? ");
		int num = s.nextInt();
		
		
		float re = (num*8*22);
		System.out.printf("\n Neste mês seu salário foi: " + "R$" + re);
	}

}
