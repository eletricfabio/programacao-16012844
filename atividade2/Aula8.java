import java.util.Scanner;

public class Aula8 {

	public static void main(String[] args) {
		// 8- As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores 
		// e lhe contrataram para desenvolver o programa que calcular� os reajustes.
		// Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, 
		// baseado no sal�rio atual:
		// * sal�rio menor que R$ 280,00 (incluindo) : aumento de 20%
		// * sal�rio maior ou igual que R$ 280,00 e menor que R$ 700,00 : aumento de 15%
		// * sal�rio maior ou igual que R$ 700,00 e menor que R$ 1500,00 : aumento de 10%
		// * sal�rio maior ou igual R$ 1500,00 em diante : aumento de 5%
		// Ap�s o aumento ser realizado, informe na tela:
		// * o sal�rio antes do reajuste;
		// * o percentual de aumento aplicado;
		// * o valor do aumento;
		// * o novo sal�rio, ap�s o aumento.
		Scanner s = new Scanner(System.in);
		
		int setor, sal�rio;
		int result;
		
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
		
		System.out.println("Digite o sal�rio do colaborador no m�s: ");
		sal�rio = s.nextInt();
		

		if (sal�rio < 280) {
			System.out.println("O aumento � de 20%:");
		} else
			if (sal�rio >= 280 && sal�rio < 700) {
				System.out.println("O aumento � de 15%:");
			} else
				if (sal�rio >= 700 && sal�rio < 1500) {
					System.out.println("O aumento � de 10%:");
				} else
					if (sal�rio >= 1500) {
						System.out.println("O aumento � de 5%:");

				}
		}
		
}