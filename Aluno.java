import java.util.Scanner;

public class Aluno {
	String nome;
	int idade;
	int matricula;
	String turno;
	int periodo;
	
	public void perfil() {
		System.out.println("---------------");
		System.out.println("Perfil do Aluno");
		System.out.println("---------------");
		
	}
	
	public void cadastrar() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nome:");
		nome = s.nextLine();
		
		System.out.println("Idade:");
		idade = s.nextInt();
		
		System.out.println("Matricula:");
		matricula = s.nextInt();
		
		System.out.println("Periodo:");
		periodo = s.nextInt();
		
		System.out.println("Turno:");
		turno = s.next();
		
		System.out.println("-----------------------------");
		System.out.println("Cadastro do Aluno Matriculado");
		System.out.println("-----------------------------");
		
		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);
		System.out.println("Matricula:" + matricula);
		System.out.println("Turno:" + turno);
		System.out.println("Periodo:" + periodo);
	}
}