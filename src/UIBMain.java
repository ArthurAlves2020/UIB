
public class UIBMain {

	public static void main(String[] args) {
		Conta ct1 = new Conta();
		
		
		ct1.cliente = new Cliente();
		ct1.cliente.nome = "Arthur";
		ct1.numero = 0001;
		ct1.saldo = 100.00;
		
		ct1.status();
	}

}
