
public class Conta {
	
	private static int ultimoNumeroGerado = 1;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public void creditar(double credito) {
		this.saldo = getSaldo() + credito;
		System.out.println("Conta " + getNumero() + " Credito de " + credito +" Saldo Total " + this.getSaldo());
		
	}
	
	public void debitar(double debito) {
		this.saldo = getSaldo() - debito;
		System.out.println("Conta" + getNumero() + " Debito de " + debito +" Saldo Total " + this.getSaldo());
		
	}
	public void transferir(double transferencia, Conta destino) {
	
	if(transferencia > 0) {
		debitar(transferencia);
		destino.creditar(transferencia);
		System.out.println("Conta " + getNumero() + " Transferencia de " + transferencia +" Para Conta de numero " + destino.getNumero()+" Do " + destino.getCliente() + " Saldo Total: " + this.getSaldo());
		
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
		System.out.println("O numero da sua Conta é: " + this.numero);
	}
	
	
}
