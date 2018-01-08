package zoo;

public class OsoPanda extends Animal{
	
	/*
	 * atributos 
	 * 
	 */
	
	private String nombre;
	private int edad; 
	
	/*
	 * metodo constructor y métodos
	 */
	
	//constructor
	
	public OsoPanda(){
		super("Oso Panda",4);
		
	}
	
	public OsoPanda(String nombre, int edad){
		super("osoPanda", 4); 
		this.nombre = nombre; 
		this.edad = edad; 
		
	}
	
	/**
	 * método mostrar sirve para que de el nombre y la edad del panda
	 */
	
	public void mostrar(){
		System.out.println("Me llamo " + this.getNombre() + " soy un "+ super.getEspecie()+" tengo " + super.getPatas()+" y tengo " + this.getEdad() + " años");
	}
	
	
	/*
	 * getters y setters
	 */

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
