import java.util.Scanner;

public class Aula7 {

	public static void main(String[] args) {
		// 7- Numa padaria trabalham x pessoas, distribu�das entre a Produ��o (recebem R$ 10 por hora) 
		// e Administrativo (recebem R$ 12 a hora). Crie um programa de computador que leia o setor onde 
		// a pessoa trabalha, quantas horas trabalhou por m�s e , no fim, deve exibir o sal�rio final a receber.
		Scanner s = new Scanner(System.in);
		
		int setor, horas;
		
		do {
			System.out.println("Digite o setor do funcion�rio (1) Produ��o e (2) Administrativo: ");
			setor = s.nextInt();

		} while (setor != 1 && setor != 2);
		
		System.out.println("------------------------------------");
		
		if (setor == 1) {
			System.out.println("Produ��o");
		} else
			if (setor == 2) {
				System.out.println("Administrativo");
				}
		
		System.out.println("------------------------------------");
		
		System.out.println("Digite as horas trabalhadas no m�s: ");
		horas = s.nextInt();
		
		float result = ((horas*8));
		
		if (setor == 1) {
			System.out.printf("O sal�rio � R$: " + result*10);
		} else
		
		if (setor == 2){
			System.out.printf("O sal�rio � R$: " + result*12);
		}
	}
}