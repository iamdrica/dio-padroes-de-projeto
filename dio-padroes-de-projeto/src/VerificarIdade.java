// Usando Singleton para explorar conceitos de padrões de projeto

import java.util.Scanner;

public class VerificarIdade {
	private static VerificarIdade instance;
	private Scanner insert;
	
	private VerificarIdade() {
		insert = new Scanner(System.in);
	}
	
	public static VerificarIdade getInstance() {
		if(instance == null) {
			instance = new VerificarIdade();
		}
		
		return instance;
	}
	
	//Verificar se é maior de idade
	
	public boolean verificarMaiorIdade(int idade) {
		return idade >= 18;
	}
	
	//Usuário vai informar  a idade via console
	
	public int idadeUsuario() {
		System.out.print("Informe a sua idade: ");
		int idade = insert.nextInt();
		return idade;
	}

	
}
