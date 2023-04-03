
public class SistemaAutentica {

	private int senha = 1234;

	public void autentica(Autenticacao g) {
		if (g.autentica(senha)){
			System.out.println("Permitido");
		} else {
			System.out.println("Sem Acesso");
		}
	}
	
}
