package cprincipal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CPrincipal {
	public static void main (String[] args) {
	{
		 //Tentativa inicial de código sem auxilio do ArrayString
		 
		 
		Scanner input = new Scanner (System.in);
		System.out.println ("=======Menu de Interacao=======");
		/* quebra de linha 
		System.out.println ("1 - Cadastrar Usuário\n" + "2 - Excluir Usuario\n" + "3 - Listar Usuarios\n" + "4 - Sair");
		*/
		System.out.println ("===============================");
		double y;
		System.out.println ("Digite sua escolha: ");
		y = input.nextDouble();
		Usuario teste1 ;
		teste1 = new Usuario(y);
		Scanner input = new Scanner(System.in);
		/*Date nascimento = new Date ();
		System.out.println ("Digite o nome do Usuário: ");
		NomeCompleto = input.nextLine();
		System.out.println ("Digite o email do Usuário: ");
		email = input.nextLine();
		System.out.println ("Digite o perfil do Usuário (Administrador/Cliente/Fornecedor): ");
		perfil = input.nextLine();
		System.out.println ("Digite a senha do Usuário: ");
		senha = input.nextLine();
		ativo = true;*/
		
		/*Para ler Usuario.GetnomeCompleto;*/
		System.out.println ("Nome do Usuario: " + teste1.NomeCompleto);
		System.out.println ("Email: " + teste1.email);
		System.out.println ("Perfil do Usuario: " + teste1.perfil);
		System.out.println ("Senha do Usuario: " + teste1.senha);
		System.out.println ("Status do Usuario: " + (teste1.ativo==true ? "Ativado" : "Desativado"));
		
		
	}

}
