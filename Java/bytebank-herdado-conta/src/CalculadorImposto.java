
public class CalculadorImposto {

	private double totalImposto;

	public void registra(Tributavel carteira) {
		double valor = carteira.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
