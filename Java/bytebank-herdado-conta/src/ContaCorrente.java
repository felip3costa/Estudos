
public class ContaCorrente extends Conta implements Tributavel{
	private String tipo = "Corrente";

	public ContaCorrente(int agencia, int conta)  {
		super(agencia, conta);
	}
	
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacar(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
