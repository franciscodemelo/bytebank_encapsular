
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(337,43425);
		System.out.println(conta.getNumero());

		Cliente francisco = new Cliente();
		francisco.setNome("Francisco junor");
		
		conta.setTitular(francisco);
		
		System.out.println(conta.getTitular().getNome());
		
		
		
	}

}
