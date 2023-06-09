
public class Gerente extends Funcionario implements Autenticacao{
	
	private AutenticacaoUtil auth;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.auth = new AutenticacaoUtil();
		// TODO Auto-generated constructor stub
	}
	
	public double getBonificacao() {
		System.out.println("Chamou no Gerente");
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
