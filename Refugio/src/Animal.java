import java.util.LinkedList;
import java.util.List;

public class Animal {
	private String Nombre;
	List <Dosis> historialVacunacion;
	
	
	public Animal(String nombre) {
		Nombre = nombre;
		historialVacunacion= new LinkedList();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String mostrarNombre() {
		return " : " + Nombre;
	}
	
	public void inyectarVacuna(Dosis dosisAgregar) {
		historialVacunacion.add(dosisAgregar);
	}

	public List<Dosis> getHistorialVacunacion() {
		return historialVacunacion;
	}

	public void setHistorialVacunacion(List<Dosis> historialVacunacion) {
		this.historialVacunacion = historialVacunacion;
	}
	
}
