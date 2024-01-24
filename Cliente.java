package es.studium.practicatema2;

/**
 * Representa la clase Cliente.
 * @author Samuel Infante Cruz.
 * 
 */
public class Cliente 
{
	/**
	 * Representa la creación de los atributos dni,nombre, dirección.
	 * 
	 */
	private String dni;
	private String nombre;
	private String direccion;
	
	/**
	 * Representa el constructor vacio de los atributos de la clase Cliente
	 */
	public Cliente()
	{
		
		dni="";
		nombre="";
		direccion="";
	}
	
	/**
	 * Constructor por parametros.
	 * @param dniRefactorizado
	 * @param nombre
	 * @param direccion
	 */
	public Cliente(String dniRefactorizado, String nombre, String direccion) 
	{
		
		
		this.dni = dniRefactorizado;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * Representa los getters and setter
	 * @return
	 */

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	

	
	
	
}
