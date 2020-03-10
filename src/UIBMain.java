
public class UIBMain {

	public static void main(String[] args) {

		
		Conta listaContas[] = new Conta[2];
		Cliente listaClientes[] = new Cliente[2];
		
		listaClientes[0] = new Cliente("Arthur", "355454658-08");
		listaClientes[1] = new Cliente("XXXXX", "355455684-99");
		
		listaContas[0] = new Conta(002, 0, listaClientes[1]);
		listaContas[1] = new Conta(001, 0, listaClientes[0]);
		
		
		listaContas[0].debitar(100);
		listaContas[0].creditar(20);
		
		listaContas[1].transferir(150, listaContas[0]);
		
		System.out.println(listaContas[0].toString());
		System.out.println(listaContas[1].toString());
		}

}
