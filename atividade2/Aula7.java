import java.util.Scanner;

public class Aula7 {

	public static void main(String[] args) {
		// 7- Numa padaria trabalham x pessoas, distribuídas entre a Produção (recebem R$ 10 por hora) 
		// e Administrativo (recebem R$ 12 a hora). Crie um programa de computador que leia o setor onde 
		// a pessoa trabalha, quantas horas trabalhou por mês e , no fim, deve exibir o salário final a receber.
		Scanner s = new Scanner(System.in);
		
		int setor, horas;
		
		do {
			System.out.println("Digite o setor do funcionário (1) Produção e (2) Administrativo: ");
			setor = s.nextInt();

		} while (setor != 1 && setor != 2);
		
		System.out.println("------------------------------------");
		
		if (setor == 1) {
			System.out.println("Produção");
		} else
			if (setor == 2) {
				System.out.println("Administrativo");
				}
		
		System.out.println("------------------------------------");
		
		System.out.println("Digite as horas trabalhadas no mês: ");
		horas = s.nextInt();
		
		float result = ((horas*8));
		
		if (setor == 1) {
			System.out.printf("O salário é R$: " + result*10);
		} else
		
		if (setor == 2){
			System.out.printf("O salário é R$: " + result*12);
		}
	}
}