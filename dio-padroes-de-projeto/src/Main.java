// Testando
public class Main {
	
	public static void main(String[] args) {
		VerificarIdade verificador = VerificarIdade.getInstance();
		int idadeUser = verificador.idadeUsuario();
		
		if(verificador.verificarMaiorIdade(idadeUser)) {
			System.out.println("Usuário é maior de idade. Acesso permitido.");
		} else {
			System.out.println("Usuário menor de idade. Acesso negado.");
		}
	}

}
