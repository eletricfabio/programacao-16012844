import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		//3- Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		// Calcule e mostre o total do seu sal�rio no referido m�s.

		Scanner s = new Scanner(System.in);
		
		System.out.println("Ol�, Quanto voc� quanha em reais(R$) por hora? ");
		int num = s.nextInt();
		
		
		float re = (num*8*22);
		System.out.printf("\n Neste m�s seu sal�rio foi: " + "R$" + re);
	}

}
