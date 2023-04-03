
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario felipe = new Gerente("Felipe", "11245612311", 3500.50);
		
		
		System.out.println(felipe.getBonificacao());
		
		//felipe.setSenha(1010);
		//System.out.println(felipe.autentica(1011));
		
		System.out.println(felipe.getBonificacao());
		
	}
	
}
