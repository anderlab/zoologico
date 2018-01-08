package zoo;

public class Mono extends Animal{

	private String nombre;
	private String raza;
	
	
	/*
	 * CONSTRUCTORS
	 */
	
	public Mono(){
		super("mono", 2);
	}
	
	public Mono(String nombre, String raza){
		super("mono", 2);
		this.nombre = nombre;
		this.raza = raza;
	}

	/*
	 * FUNCTIONS & METHODS
	 */
	
	@Override
	public void mostrar() {

		System.out.println("Me llamo " + nombre + " y soy un "+ super.getEspecie() +" de la raza " + raza  +" y tengo "+ super.getPatas()+" patas");
	}
	
	
	
	
	
	/*
	 * GETTERS & SETTERS
	 */

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}

	
	
}
