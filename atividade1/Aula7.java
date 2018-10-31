import java.util.Scanner;

public class Aula7 {

	public static void main(String[] args) {
		// 7- Faça um Programa que converta metros para centímetros.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá, digite a distância em metros: ");
		float num = s.nextFloat();
		
		double dist = (num/0.01);
		System.out.println("A distâcia em centímetros é: " + dist + "cm");
		
	}

}
