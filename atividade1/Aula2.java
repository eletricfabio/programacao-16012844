import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// 2- Entrar com dois n�meros inteiros e imprimir a seguinte sa�da:
		//Dividendo:
		//Divisor:
		//Quociente:
		//Resto:
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num1 = s.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int num2 = s.nextInt();
		
		
		System.out.printf("\n O dividendo �: %d", num1);
		
		System.out.printf("\n O divisor �: %d", num2);
		
		float qc = (num1/num2);
		System.out.printf("\n O quociente do n�mero �: %.1f", qc);
		
		float re = (num1%num2);
		System.out.printf("\n O resto do n�mero �: %.1f", re);
	}

}
