package es.studium.practicatema2;

public class Cliente 
{
	private String dni;
	private String nombre;
	private String direccion;
	
	//Constructor vacio
	public Cliente()
	{
		dni="";
		nombre="";
		direccion="";
	}
	

	public Cliente(String dniRefactorizado, String nombre, String direccion) {
		
		this.dni = dniRefactorizado;
		this.nombre = nombre;
		this.direccion = direccion;
	}


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
