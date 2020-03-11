import java.util.Scanner;

public class UIBMain {

	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		
		final int TOTAL_DE_CLIENTES = 2;
		Conta listaContas[] = new Conta[TOTAL_DE_CLIENTES];
		Cliente listaClientes[] = new Cliente[TOTAL_DE_CLIENTES];
				
		System.out.println("|---------- UIB - Unit Internet Banking ----------|");
		
		// Instancias dos Objetos, com Nome, Saldo, Cpf, Numero e Cliente.
		for(int i =0; i<TOTAL_DE_CLIENTES; i++) {
			listaClientes[i] = new Cliente();
			listaContas[i] = new Conta();
			
			System.out.println("Digite seu nome");
			listaClientes[i].setNome(leTeclado.next());;
			listaContas[i].setSaldo(0);
			
			System.out.println("Digite seu CPF");
			listaClientes[i].setCpf(leTeclado.next());
			
			listaContas[i].setNumero(0);
			listaContas[i].gerarNumero();
			
			listaContas[i].setCliente(listaClientes[i]);
		}
			// Operações de teste.
			listaContas[0].creditar(100);
			listaContas[1].creditar(500);
			
			listaContas[0].transferir(100.0, listaContas[1]);
			
			//Confirmação do cadastro.
			System.out.println(listaContas[0].toString());
			System.out.println(listaContas[1].toString());
		
		//listaClientes[0] = new Cliente("Arthur", "355454658-08");
		//listaClientes[1] = new Cliente("XXXXX", "355455684-99");
		//listaClientes[2] = new Cliente("Maisa" , "342555878-08");
		//listaClientes[3] = new Cliente("José", "333014225-89");
		
		//listaContas[0] = new Conta(listaClientes[1]);
		//listaContas[1] = new Conta(listaClientes[0]);
		//listaContas[2] = new Conta(listaClientes[2]);
 		//listaContas[3] = new Conta(listaClientes[3]);
 				
		//listaContas[0].gerarNumero();
		//listaContas[1].gerarNumero();
		//listaContas[2].gerarNumero();
		//listaContas[3].gerarNumero();
		
		//listaContas[0].debitar(100);
		//listaContas[0].creditar(20);
		//listaContas[2].creditar(500);
		//listaContas[3].creditar(1000);
		
		//listaContas[1].transferir(150, listaContas[0]);
		
		//System.out.println(listaContas[0].toString());
		//System.out.println(listaContas[1].toString());
		//System.out.println(listaContas[2].toString());
		//System.out.println(listaContas[3].toString());
		}

}
