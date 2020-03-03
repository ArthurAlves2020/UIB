
public class Conta {
	public int numero;
	public double saldo;
	public Cliente cliente;
	

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
	
	public void status() {
		System.out.println(this.numero);
		System.out.println(this.saldo);
		System.out.println(this.cliente.getNome());


	}
}
