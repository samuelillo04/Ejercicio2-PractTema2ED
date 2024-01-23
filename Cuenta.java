package es.studium.practicatema2;

public class Cuenta 
{
	
	private int numCuenta;
	private Cliente cliente;
	private int Saldo;
	
	public Cuenta()
	{
		
		numCuenta=0;
		cliente= new Cliente();
		Saldo=0;
	}
	

	public Cuenta(int numCuenta, Cliente cliente, int saldo) {
		
		this.numCuenta = numCuenta;
		this.cliente = cliente;
		this.Saldo = saldo;
	}


	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	
	
	
	
	
}
