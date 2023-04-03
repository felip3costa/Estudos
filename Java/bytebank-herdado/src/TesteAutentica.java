
public class TesteAutentica {
	
	public static void main(String[] args) {
		
		Autenticacao felipe = new Gerente ("Felipe", "123456789", 5000);
		felipe.setSenha(12354);
		
		Autenticacao adm = new Administrador("Felipe", "123456789", 5000);
		adm.setSenha(1234);
		
		Autenticacao c = new Cliente();
		c.setSenha(1234);

		SistemaAutentica autenticacao = new SistemaAutentica();
		
		autenticacao.autentica(felipe);
		autenticacao.autentica(c);
		autenticacao.autentica(adm);
		
	}
}
