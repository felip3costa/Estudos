
public class Administrador extends Funcionario implements Autenticacao{
	
	private AutenticacaoUtil auth;
	
	public Administrador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.auth = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamou no Adm");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.auth.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return this.auth.autentica(senha);
	}

}
