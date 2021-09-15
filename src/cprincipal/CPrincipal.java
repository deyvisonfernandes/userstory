package cprincipal;

import java.util.Scanner;

public class CPrincipal {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("=======Menu de Interacao=======");
		System.out.println ("1 - Cadastrar Usuário\n" + "2 - Excluir Usuario\n" + "3 - Listar Usuarios\n" + "4 - Sair");
		System.out.println ("===============================");
		double y;
		System.out.println ("Digite sua escolha: ");
		y = input.nextDouble();
		Usuario teste1 ;
		teste1 = new Usuario(y);
		
		System.out.println ("Nome do Usuario: " + teste1.NomeCompleto);
		System.out.println ("Email: " + teste1.email);
		System.out.println ("Perfil do Usuario: " + teste1.perfil);
		System.out.println ("Senha do Usuario: " + teste1.senha);
		System.out.println ("Status do Usuario: " + (teste1.ativo==true ? "Ativado" : "Desativado"));
		
		
	}

}
