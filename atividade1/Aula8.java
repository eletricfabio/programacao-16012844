import java.util.Scanner;

public class Aula8 {

	public static void main(String[] args) {
		// 8- Faça um Programa que pergunte quanto você ganha por hora
		// e o número de horas trabalhadas no mês. Calcule e mostre o 
		// total do seu salário no referido mês.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá, digite quanto você ganha por hora? ");
		double num1 = s.nextDouble();
		
		System.out.println("Digite quantos dias trabalhados: ");
		double num2 = s.nextDouble();
		
		double salario = (num1*num2*8);
		System.out.printf("\nValor da hora de trabalho: " + "R$ " + num1);
		
		System.out.printf("\nHoras trabalhadas no mês: " + num2);
		
		System.out.printf("\nO valor do salário este mês é: " + "R$ " + salario);

	}

}
