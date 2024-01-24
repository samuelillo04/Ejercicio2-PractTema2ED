package es.studium.practicatema2;

/**
 * Representa la clase Cuenta.
 * @author Samuel Infante Cruz.
 * 
 */
public class Cuenta 
{
	/**
	 * Representa la cración de los atributos numCuenta, cliente, Saldo.
	 */
	private int numCuenta;
	private Cliente cliente;
	private int Saldo;
	
	/**
	 * Representa el constructor vacio de los atributos de la clase Cuenta
	 */
	public Cuenta()
	{
		
		cuenta();
	}

	
	private void cuenta() {
		numCuenta=0;
		cliente= new Cliente();
		Saldo=0;
	}
	
/**
	 * Constructor por parametros.
	 * @param numCuenta
	 * @param cliente
	 * @param saldo
	 */
	
	public Cuenta(int numCuenta, Cliente cliente, int saldo) {
		
		this.numCuenta = numCuenta;
		this.cliente = cliente;
		int saldo2 = saldo;
		this.Saldo = saldo2;
	}

	/**
	 * Representa los getters and setter
	 * @return
	 */
	
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
