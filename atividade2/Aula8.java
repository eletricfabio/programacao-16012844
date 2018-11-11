import java.util.Scanner;

public class Aula8 {

	public static void main(String[] args) {
		// 8- As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores 
		// e lhe contrataram para desenvolver o programa que calculará os reajustes.
		// Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
		// baseado no salário atual:
		// * salário menor que R$ 280,00 (incluindo) : aumento de 20%
		// * salário maior ou igual que R$ 280,00 e menor que R$ 700,00 : aumento de 15%
		// * salário maior ou igual que R$ 700,00 e menor que R$ 1500,00 : aumento de 10%
		// * salário maior ou igual R$ 1500,00 em diante : aumento de 5%
		// Após o aumento ser realizado, informe na tela:
		// * o salário antes do reajuste;
		// * o percentual de aumento aplicado;
		// * o valor do aumento;
		// * o novo salário, após o aumento.
		Scanner s = new Scanner(System.in);
		
		int setor, salário;
		int result;
		
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
		
		System.out.println("Digite o salário do colaborador no mês: ");
		salário = s.nextInt();
		

		if (salário < 280) {
			System.out.println("O aumento é de 20%:");
		} else
			if (salário >= 280 && salário < 700) {
				System.out.println("O aumento é de 15%:");
			} else
				if (salário >= 700 && salário < 1500) {
					System.out.println("O aumento é de 10%:");
				} else
					if (salário >= 1500) {
						System.out.println("O aumento é de 5%:");

				}
		}
		
}