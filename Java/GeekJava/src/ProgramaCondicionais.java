
public class ProgramaCondicionais {

	public static void main(String[] args) {
		
		int idade = 17;
		int qtdPessoas = 1;
		boolean acompanhado = qtdPessoas >= 2;
		boolean permissao = false;
		
		if (idade >= 18) {
			System.out.println("Ta vei já!");			
		} else {
			if (permissao) {
				System.out.println("Minha mãe deixa.");
			} else {
				System.out.println("Ta novo ainda, e nem tem permissão");
			}	
		}
		
		//another way to do this
		
		if (idade >= 18 || permissao || acompanhado) {
			System.out.println("Vai lá");			
		} else {
			System.out.println("Deu ruim então..");
		}
	}
}


