import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		// 11- Fa�a um algoritmo que leia o tempo de dura��o de um evento em uma f�brica
		// expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ol�, digite o tempo de dura��o do evento: ");
		double temp = s.nextDouble();
		
		float tempHora = (float) (temp/3600);
		System.out.printf("\n A dura��o do evento em horas: %.2f" , tempHora);
		
		float tempMin = (float) (temp/60);
		System.out.printf("\n A dura��o do evento em minutos: %.2f" , tempMin);
		
		float tempSeg = (float) (temp % 3600);
		System.out.printf("\n A dura��o do evento em segundos: %.2f" , tempSeg);
	}

}
