import java.util.Scanner;

public class Aula7 {

	public static void main(String[] args) {
		// 7- Fa�a um Programa que converta metros para cent�metros.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ol�, digite a dist�ncia em metros: ");
		float num = s.nextFloat();
		
		double dist = (num/0.01);
		System.out.println("A dist�cia em cent�metros �: " + dist + "cm");
		
	}

}
