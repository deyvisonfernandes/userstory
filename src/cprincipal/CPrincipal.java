package cprincipal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CPrincipal {
	public static void main (String[] args) {
	{
		 
		Scanner input = new Scanner (System.in);
		System.out.println ("=======Menu de Interacao=======");
		System.out.println ("1 - Cadastrar Usu�rio");
		System.out.println ("2 - Excluir Usuario");
		System.out.println ("3 - Listar Usuarios");
		System.out.println ("4 - Sair");
		System.out.println ("===============================");
		System.out.println ("Digite sua escolha: ");
		y = input.nextDouble();
		Usuario teste1 ;
		teste1 = new Usuario(y);
		Scanner input = new Scanner(System.in);
		/*Date nascimento = new Date ();
		System.out.println ("Digite o nome do Usu�rio: ");
		NomeCompleto = input.nextLine();
		System.out.println ("Digite o email do Usu�rio: ");
		email = input.nextLine();
		System.out.println ("Digite o perfil do Usu�rio (Administrador/Cliente/Fornecedor): ");
		perfil = input.nextLine();
		System.out.println ("Digite a senha do Usu�rio: ");
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
