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
		System.out.println ("Digite o nome do Usu�rio: ");
		NomeCompleto = input.nextLine();
		System.out.println ("Digite o email do Usu�rio: ");
		email = input.nextLine();
		System.out.println ("Digite o perfil do Usu�rio (Administrador/Cliente/Fornecedor): ");
		perfil = input.nextLine();
		System.out.println ("Digite a senha do Usu�rio: ");
		senha = input.nextLine();
		ativo = true;
		
		
	}
	
	
	

}
