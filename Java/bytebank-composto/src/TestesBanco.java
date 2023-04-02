
public class TestesBanco {

	public static void main(String[] args) {
				
		
		Cliente felipe = new Cliente();
		Conta contaFelipe = new Conta(1234, 33550, felipe);
		Conta contaFelipe2 = new Conta(1234, 33550, felipe);
		Conta contaFelipe3 = new Conta(1234, 33550, felipe);

		System.out.println(Conta.getTotal());
		
		
	}
	
}
