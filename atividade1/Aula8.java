import java.util.Scanner;

public class Aula8 {

	public static void main(String[] args) {
		// 8- Fa�a um Programa que pergunte quanto voc� ganha por hora
		// e o n�mero de horas trabalhadas no m�s. Calcule e mostre o 
		// total do seu sal�rio no referido m�s.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ol�, digite quanto voc� ganha por hora? ");
		double num1 = s.nextDouble();
		
		System.out.println("Digite quantos dias trabalhados: ");
		double num2 = s.nextDouble();
		
		double salario = (num1*num2*8);
		System.out.printf("\nValor da hora de trabalho: " + "R$ " + num1);
		
		System.out.printf("\nHoras trabalhadas no m�s: " + num2);
		
		System.out.printf("\nO valor do sal�rio este m�s �: " + "R$ " + salario);

	}

}
