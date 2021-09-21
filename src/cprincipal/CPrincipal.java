package cprincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CPrincipal {
	public static void main (String[] args) {
	{
		boolean condicao = true; 
		int escolha;
		Scanner input = new Scanner (System.in);
		List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
		while (condicao == true) {
			System.out.println ("=======Menu de Interacao=======");
			System.out.println ("1 - Cadastrar Usuário");
			System.out.println ("2 - Excluir Usuario");
			System.out.println ("3 - Listar Usuarios");
			System.out.println ("4 - Sair");
			System.out.println ("===============================");
			System.out.println ("Digite sua escolha: ");
			escolha = input.nextInt();
			switch (escolha) {
			case 1:
				System.out.println ("Digite o nome do Usuario: ");
				String nome = input.nextLine();
				System.out.println ("Digite o email do Usuario: ");
				String email = input.nextLine();
				System.out.println ("Digite a senha do Usuario: ");
				String senha = input.nextLine();
				System.out.println ("Digite a data de nascimento do Usuario (dd/mm/yy: ");
				String dataDeNascimento = input.nextLine();
				System.out.println ("Digite o perfil do Usuario: ");
				String perfil = input.nextLine();
				boolean ativo = true;
				System.out.println ("Id: ");
				int id = input.nextInt();
				Usuario usuario = new Usuario(id, nome, dataDeNascimento, senha, email, ativo, perfil);
				listaDeUsuarios.add(usuario);
				
			case 2:
				System.out.println ("Lista de usuários cadastrados:");
				for (int i = 0; i < listaDeUsuarios.size(); i++) {
					System.out.println ("Nome do Usuario: " + listaDeUsuarios.get(i).getNomeCompleto());
					System.out.println ("Email do Usuario: " + listaDeUsuarios.get(i).getEmail());
					System.out.println ("Senha do Usuario: " + listaDeUsuarios.get(i).getSenha());
					System.out.println ("Status do Usuario: " + listaDeUsuarios.get(i).isAtivo());
					System.out.println ("Nome do Usuario: " + listaDeUsuarios.get(i).getNomeCompleto());
					System.out.println ("Data de Nascimento do Usuario: " + listaDeUsuarios.get(i).getDataDeNascimento());
					System.out.println ("ID do Usuario: " + listaDeUsuarios.get(i).getId());
					
				}
				
			case 3:
				
			case 4:
				System.out.println ("Saindo...");
				break;
				
			default:
				System.out.println ("Opcao Incorreta. Tente novamente.");
				
			}
			
		}
			
		}
		
		
	}

}
