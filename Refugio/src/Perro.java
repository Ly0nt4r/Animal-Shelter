public class Perro extends Animal {
	
	public Perro(String nombre) {
		super(nombre);
	}
	
	public String mostrarNombre() {
		return "Perro" + super.mostrarNombre();
	}
}