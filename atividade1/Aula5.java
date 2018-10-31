import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		// 5- Faça um Programa que peça a temperatura em graus Fahrenheit,
		// transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá, digite a temperatura em graus Fahrenheit (°F): ");
		float num = s.nextFloat();
		
		float c = ((5*(num-32))/9);
		System.out.println("A temperatura em graus Celsius é: " + c + "°C");
		
	}

}
