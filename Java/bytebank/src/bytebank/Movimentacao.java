package bytebank;

public class Movimentacao {
	
	public static void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		
		if (contaOrigem.saldo > valor) {
			contaOrigem.saldo -= valor;
			contaDestino.saldo += valor;
		}
		
		return;		
	}
	
}
