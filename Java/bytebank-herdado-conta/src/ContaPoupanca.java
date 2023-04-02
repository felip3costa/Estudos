
public class ContaPoupanca extends Conta{
	private String tipo = "Poupança";

	public ContaPoupanca(int agencia, int conta)  {
		super(agencia, conta);
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
