package zoo;

public class Perro extends Animal {

	/*
	 * atributos 
	 * 
	 */

	private String raza;
	private String color;
	private String nombre;
	
	/*
	 * metodo constructor y métodos
	 */
	
	//constructor
	
	public Perro() {
		super("perro", 4);
		this.nombre=nombre;
	}
	

	

	/* (non-Javadoc)
	 * @see zoo.Animal#mostrar()
	 */
	public void mostrar() {

		System.out.println("Me llamo " +this.getNombre()+" tengo "+ super.getPatas()+" patas " + " y soy un "+super.getEspecie()+" de la raza " + raza);
	}
	
	
	/*
	 * getters y setters
	 */
	
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
