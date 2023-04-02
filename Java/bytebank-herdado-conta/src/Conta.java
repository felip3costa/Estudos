public class Conta {

	private double saldo;
	private int agencia;
	private int conta;
	private Cliente titular;
	private static int totalContas;
	
	public Conta(int agencia, int conta) {
		
		setAgencia(agencia);
		setConta(conta);
		
		totalContas++;
		
		
	}
	
	private boolean setAgencia(int agencia) {
		if (this.agencia == 0 && agencia > 0) {
			this.agencia = agencia;
			return true;
		}
		System.out.println("Agencia informada invalida!");
		return false;
	}
	
	private boolean setConta(int conta) {
		if (this.conta == 0 && conta > 0) {
			this.conta = conta;
			return true;
		}
		System.out.println("Conta informada invalida!");
		return false;
	}
	
	private boolean setTitular(Cliente titular) {
		try {
			this.titular = titular;
			return true;
			
		} catch (Exception e) {
			System.out.println("Cliente não encontrado");
			return false;
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Foi depositado R$" + valor + "!");
		}
		
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			System.out.println("Foi sacado R$" + valor + "!");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(Conta contaDestino, double valor) {
		if (this.sacar(valor)) {
			contaDestino.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getConta() {
		return this.conta;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.totalContas;
	}
	
}
