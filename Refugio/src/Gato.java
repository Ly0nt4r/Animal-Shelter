public class Gato extends Animal {
	
	public Gato(String nombre) {
		super(nombre);
		
	}
	
	public String mostrarNombre() {
		return "Gato" + super.mostrarNombre();
	}
}
