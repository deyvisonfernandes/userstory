package cprincipal;
import java.util.Scanner;
import java.util.Date;
import java.util.Scanner;

public class Usuario {
	int id = 000;
	String NomeCompleto;
	Date datadenascimento;
	String senha;
	String email;
	boolean ativo;
	String perfil;
	
	
	public Usuario(double x) {
		Scanner input = new Scanner(System.in);
		System.out.println ("Digite o nome do Usuário: ");
		NomeCompleto = input.nextLine();
		System.out.println ("Digite o email do Usuário: ");
		email = input.nextLine();
		System.out.println ("Digite o perfil do Usuário (Administrador/Cliente/Fornecedor): ");
		perfil = input.nextLine();
		System.out.println ("Digite a senha do Usuário: ");
		senha = input.nextLine();
		ativo = true;
		
		
	}
	
	
	

}
