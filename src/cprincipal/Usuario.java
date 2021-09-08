package cprincipal;

import java.util.Date;
import java.util.Scanner;

public class Usuario {
	int id = 000;
	String NomeCompleto;
	Date datadenascimento;
	long senha;
	String email;
	boolean ativo;
	String perfil;
	
	
	public void InserirNome() {
		Scanner input = new Scanner(System.in);
		System.out.println ("Digite o nome do Usuário: ");
		NomeCompleto = input.nextLine();
		
	}
	
	

}
