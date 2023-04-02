


public class Testes03 {


	public class Pessoa {

	    String nome;
	    String cpf;
	    int idade;
	    Endereco endereco;
	    
	}

	public class Endereco {

	    String logradouro;
	    String complemento;
	    String numero;
	    String bairro;
	    String cidade;
	    String cep;

	}

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco.logradouro  = "Avenida XYZ";
    }
	
}
