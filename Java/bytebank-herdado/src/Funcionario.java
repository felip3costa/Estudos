
//classe abstrata não pode ser instanciada, apenas as filhas.
public abstract class Funcionario {	
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, String cpf, double salario) {
		try {
			setNome(nome);
			setCpf(cpf);
			setSalario(salario);
			
			System.out.println("Funcionário '" + getNome() + "' cadastrado!");
			
		} catch (Exception e) {
			System.out.println("Não foi possível cadastrar o funcionário");
		}
		
	}
	
	// método abstrato é quando só o filho tem implementação.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


	
}
