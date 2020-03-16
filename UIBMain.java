import java.util.Scanner;

public class UIBMain {

	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		
		int opcao;
		final int TOTAL_DE_CLIENTES = 2;
		Conta contas[] = new Conta[TOTAL_DE_CLIENTES];
		Cliente clientes[] = new Cliente[TOTAL_DE_CLIENTES];
			do {
		System.out.println("|---------- UIB - Unit Internet Banking ----------|");
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Cadastrar Conta");
		System.out.println("2 - Fazer depósito");
		System.out.println("3 - Fazer sacar");
		System.out.println("4 - Fazer transferencia");
		System.out.println("0 - Sair");
		opcao = leTeclado.nextInt();
			if(opcao == 1){
				System.out.println("Quantas contas deseja cadastrar?");
				int qtdContas = leTeclado.nextInt();
					for(int i =0; i<qtdContas; i++) {
						clientes[i] = new Cliente();
						contas[i] = new Conta();
						
						System.out.println("Abrindo Criação de contas, o numero da sua conta é: " + i);
						System.out.println("Digite o nome do títular da conta: " + i);
						clientes[i].setNome(leTeclado.next());;
						contas[i].setSaldo(0);
						
						System.out.println("Digite o CPF do títular da conta: " + i);
						clientes[i].setCpf(leTeclado.next());
						
						System.out.println("Cadastre sua senha (4 números): ");
						contas[i].setSenha(leTeclado.nextInt());
						
						contas[i].setNumero(0);
						contas[i].gerarNumero();
					
						contas[i].setCliente(clientes[i]);
				}

			}else if(opcao == 2) {
				System.out.println("Digite o numero da sua conta");
				int numConta = leTeclado.nextInt();
				System.out.println("Digite sua senha");
				int senha = leTeclado.nextInt();
					if(senha == contas[numConta].getSenha()) {
						System.out.println("Qual valor deseja depositar?");
						double valor = leTeclado.nextDouble();
						contas[numConta].creditar(valor);
					}else {
						System.out.println("Senha incorreta");
					}
			}else if(opcao == 3) {
				System.out.println("Digite o numero da sua conta");
				int numConta = leTeclado.nextInt();
				System.out.println("Digite sua senha");
				int senha = leTeclado.nextInt();
					if(senha == contas[numConta].getSenha()) {
						System.out.println("Qual valor deseja Sacar?");
						double valor = leTeclado.nextDouble();
							if(contas[numConta].getSaldo() >= valor) {
								contas[numConta].debitar(valor);
							}else {
								System.out.println("Saldo insuficiente.");
						}
					}else {
						System.out.println("Senha incorreta");
				}
				
			}else if(opcao == 4) {
				System.out.println("Digite o numero da sua conta");
				int numConta = leTeclado.nextInt(); 
				System.out.println("Digite sua senha");
				int senha = leTeclado.nextInt();
					if(senha == contas[numConta].getSenha()) {
						System.out.println("Qual valor deseja transferir?");
						double valor = leTeclado.nextDouble();
							if(contas[numConta].getSaldo() >= valor) {
								System.out.println("Digite o numero da conta para qual conta deseja trasferir? ");
								int contaTransf = leTeclado.nextInt();
								contas[numConta].transferir(valor, contas[contaTransf]);
							}else {
						System.out.println("Saldo insuficiente");
					}
				}else {
					System.out.println("Senha Incorreta");
				}
			}
		
			}while(opcao != 0);
				System.out.println("Muito Obrigado!");
			
		
		
		/* Instancias dos Objetos, com Nome, Saldo, Cpf, Numero e Cliente.
		for(int i =0; i<TOTAL_DE_CLIENTES; i++) {
			clientes[i] = new Cliente();
			contas[i] = new Conta();
			
			System.out.println("Digite seu nome");
			clientes[i].setNome(leTeclado.next());;
			contas[i].setSaldo(0);
			
			System.out.println("Digite seu CPF");
			clientes[i].setCpf(leTeclado.next());
			
			contas[i].setNumero(0);
			contas[i].gerarNumero();
			
			contas[i].setCliente(clientes[i]);
		}
			// Operações de teste.
			contas[0].creditar(100);
			contas[1].creditar(500);
			
			contas[0].transferir(100.0, contas[1]);
			
			//Confirmação do cadastro.
			System.out.println(contas[0].toString());
			System.out.println(contas[1].toString());*/
		
		
		}

}
