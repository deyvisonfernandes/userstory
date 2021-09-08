package cprincipal;
public class CPrincipal {
	public static void main (String[] args) {
		System.out.println ("=======Menu de Interacao=======");
		System.out.println ("1 - Cadastrar Usuário\n" + "2 - Excluir Usuario\n" + "3 - Listar Usuarios\n" + "4 - Sair");
		System.out.println ("===============================");
		Usuario teste1 = new Usuario();
		teste1.InserirNome();
		System.out.println ("Nome do Usuario: " + teste1.NomeCompleto);
	}

}
