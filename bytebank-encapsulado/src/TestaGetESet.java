
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24225);
		//conta.numero = 1337; (Não compila pois é privado)
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo; (Não compila pois é privado)
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//Agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	} 
}
