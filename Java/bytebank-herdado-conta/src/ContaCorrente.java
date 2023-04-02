
public class ContaCorrente extends Conta{
	private String tipo = "Corrente";

	public ContaCorrente(int agencia, int conta)  {
		super(agencia, conta);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacar(valorASacar);
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
