import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		// Faça um Programa que pergunte em que turno você estuda. 
		// Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
		Scanner t = new Scanner(System.in);
		
		int turno;
		
		do {
		System.out.printf("Em que turno você estuda? (1) M-matutino / (2) V-Vespertino / (3) N- Noturno: ");
		turno = t.nextInt();
		
		if (turno != 1 && turno != 2 && turno != 3) {
			System.out.println("Valor Inválido!");
		}
		
		} while (turno != 1 && turno != 2 && turno != 3);
		
		if (turno == 1) {
			System.out.println("Bom dia!");
		} else
			if (turno == 2) {
				System.out.println("Boa tarde!");
			} else
				if (turno == 3) {
					System.out.println("Boa Noite!");
			}
	}

}
