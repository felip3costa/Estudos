
public class EditorVideo extends Funcionario {
	
	public EditorVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonificacao() {
		System.out.println("Chamou no Editor");
		return super.getBonificacao() + 100;
	}

}
