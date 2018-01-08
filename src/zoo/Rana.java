package zoo;

public class Rana extends Animal{

	private String Color;
	
	
	//Constructores
	
	public Rana(){
		super("Rana",4);
		
	}
	
	public Rana(String especie, int patas, String Color) {
		this.setColor(Color);
		super.setEspecie(especie);
		super.setPatas(patas);
	}
	
	//Getters y Setters
	
	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}
	
	//MostrarInfo
	
	public void mostrar(){
		System.out.println("La especie es: " + super.getEspecie());
		System.out.println("Tiene " + super.getPatas() + " patas.");
		System.out.println("Es de color " + this.getColor());
	}
	
	

}