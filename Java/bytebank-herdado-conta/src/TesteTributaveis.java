
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1234, 1010);
		cc.depositar(5000);
		
		SeguroVida sv = new SeguroVida();
		
		CalculadorImposto tributos = new CalculadorImposto();
		
		double imposto = cc.getValorImposto();
		System.out.println(imposto);
		
		tributos.registra(sv);
		tributos.registra(cc);
		
		System.out.println(tributos.getTotalImposto());
		
	}
	
	
}
