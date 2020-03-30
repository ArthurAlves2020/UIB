import java.util.Scanner;

public class UIBMain {

	public static void main(String[] args) {

		Scanner leTeclado = new Scanner(System.in);
		
		//Declaração de variável opção(menu), constante de total de contas, e instancia de ADM, Contas e Clientes.
		int opcao;
		final int TOTAL_DE_CONTAS = 10;
		Administrador admin = new Administrador("admin", "admin");
		Conta contas[] = new Conta[TOTAL_DE_CONTAS];
		Cliente clientes[] = new Cliente[TOTAL_DE_CONTAS];
		//Menu de opções.
		do {
			System.out.println("|---------- UIB - Unit Internet Banking ----------|");
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Cadastrar Conta");
			System.out.println("2 - Fazer depósito");
			System.out.println("3 - Fazer sacar");
			System.out.println("4 - Fazer transferencia");
			System.out.println("5 - Clientes cadastrados");
			System.out.println("0 - Sair");
			opcao = leTeclado.nextInt();
			switch (opcao) {
			//Cadastro de contas.
			case 1:
				System.out.println("Digite seu Login e Senha: ");
				System.out.println("Login:");
				String loginAdm = leTeclado.next();
				System.out.println("Senha: ");
				String senhaAdm = leTeclado.next();
				if (loginAdm.equals(admin.getLogin()) && senhaAdm.equals(admin.getSenha())) {
					System.out.println("Quantas contas deseja cadastrar?");
					int qtdContas = leTeclado.nextInt();
					for (int i = 1; i <= qtdContas; i++) {
						clientes[i] = new Cliente();
						contas[i] = new Conta();

						System.out.println("Abrindo Criação de contas, o numero da sua conta é: " + i);
						System.out.println("Digite o nome do títular da conta: " + i);
						clientes[i].setNome(leTeclado.next());
						;
						contas[i].setSaldo(0);

						System.out.println("Digite o CPF do títular da conta: " + i);
						clientes[i].setCpf(leTeclado.next());

						System.out.println("Cadastre sua senha: ");
						contas[i].setSenha(leTeclado.next());

						contas[i].setNumero(1);
						contas[i].gerarNumero();

						contas[i].setCliente(clientes[i]);
					}
					break;

				} else {
					System.out.println("Login/Senha inválido");
					break;
				}
			//Depósito em conta.
			case 2:
				System.out.println("Digite o numero da sua conta");
				int numConta = leTeclado.nextInt();
				System.out.println("Digite sua senha");
				String senha = leTeclado.next();
				if (senha == contas[numConta].getSenha()) {
					System.out.println("Qual valor deseja depositar?");
					double valor = leTeclado.nextDouble();
					contas[numConta].creditar(valor);
				} else {
					System.out.println("Senha incorreta");
				}
				break;
			//Saque da conta.
			case 3:
				System.out.println("Digite o numero da sua conta");
				numConta = leTeclado.nextInt();
				System.out.println("Digite sua senha");
				senha = leTeclado.next();
				if (senha.equals(contas[numConta].getSenha())) {
					System.out.println("Qual valor deseja Sacar?");
					double valor = leTeclado.nextDouble();
					if (contas[numConta].getSaldo() >= valor) {
						contas[numConta].debitar(valor);
					} else {
						System.out.println("Saldo insuficiente.");
					}
				} else {
					System.out.println("Senha incorreta");
				}
				break;
			//Transferência entre duas contas.
			case 4:
				System.out.println("Digite o numero da sua conta");
				numConta = leTeclado.nextInt();
				System.out.println("Digite sua senha");
				senha = leTeclado.next();
				if (senha.equals(contas[numConta].getSenha())) {
					System.out.println("Qual valor deseja transferir?");
					double valor = leTeclado.nextDouble();
					if (contas[numConta].getSaldo() >= valor) {
						System.out.println("Digite o numero da conta para qual conta deseja trasferir? ");
						int contaTransf = leTeclado.nextInt();
						contas[numConta].transferir(valor, contas[contaTransf]);
					} else {
						System.out.println("Saldo insuficiente");
					}
				} else {
					System.out.println("Senha Incorreta");
				}

			//Mostra CLientes e Contas cadastrados.
			case 5:
				System.out.println("Digite seu Login e Senha: ");
				System.out.println("Login:");
				loginAdm = leTeclado.next();
				System.out.println("Senha: ");
				senhaAdm = leTeclado.next();
				if (loginAdm.equals(admin.getLogin()) && senhaAdm.equals(admin.getSenha())) {
					for (Cliente listaCliente : clientes) {
						if (listaCliente != null) {
							System.out.println(listaCliente);
						} else {
							continue;
						}

					}

					for (Conta listaConta : contas) {
						if (listaConta != null) {
							System.out.println(listaConta);
						} else {
							continue;
						}
					}
				}else {
					System.out.println("Login inválido");
				}
				

			case 0:
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		}while(opcao!=0);System.out.println("Muito Obrigado!");
	}
}
