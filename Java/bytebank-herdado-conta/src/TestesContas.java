
public class TestesContas {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca(1, 1234);
		ContaCorrente cc = new ContaCorrente(1, 1235);
		
		cp.depositar(5000);
		cc.depositar(350);
		
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		
		cc.transfere(cc, 200);

		System.out.println(cc.getSaldo());

	}

}
