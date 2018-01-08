package zoo;

public class Main_Ander_L {

	public static void main(String[] args) {
		
		Animal[] animales = new Animal[5];
		
		animales[0]= new Pinguino();
		
		animales[1]= new Mono();
		
		animales[2]= new Leon();
		
		animales[3]= new Gekko();
		
		animales[4]= new Perro();
		
		
		
		
		
		
		
		
		
		for (int i =0; i< animales.length ; i++){
			
			Animal animal = animales[i];
			animal.mostrar();
			
			
		}
		
		Animal a= new Pinguino();
		Pinguino p = new Pinguino();
		
	
		
		

	}

}
