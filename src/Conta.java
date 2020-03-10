
public class Conta {
	
	private static int ultimoNumeroGerado = 1;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	
	
	public Conta(int numero, double saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public void creditar(double credito) {
		this.saldo = getSaldo() + credito;
		
	}
	
	public void debitar(double debito) {
		this.saldo = getSaldo() - debito;
		
	}
	public void transferir(double transferencia, Conta destino) {
	
	if(transferencia > 0) {
		debitar(transferencia);
		destino.creditar(transferencia);
		
	}
				
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + "]";
	}
	
	public void gerarNumero() {
		this.numero = ultimoNumeroGerado ++;
	}
	
	
}
