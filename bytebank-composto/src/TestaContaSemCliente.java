
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDamarcela = new Conta();
		System.out.println(contaDamarcela.getSaldo());
		
		contaDamarcela.titular = new Cliente();
		System.out.println(contaDamarcela.titular);
		
		contaDamarcela.titular.nome = "Marcela";
		System.out.println(contaDamarcela.titular.nome);
	}
}
