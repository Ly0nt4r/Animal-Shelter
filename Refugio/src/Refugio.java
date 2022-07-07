import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Refugio{
	
	// creamos una pila refugio para ir añadiendo los animales.
	Queue<Animal> refugio= new LinkedList();
	
		
	// metoo para introducir animales en la pila 
	public void entrarAnimal(Animal nuevoAnimal) {
		if (nuevoAnimal instanceof Perro || nuevoAnimal instanceof Gato) {
			refugio.add(nuevoAnimal);			
			//agregamos las vacunas pertinente
			if (nuevoAnimal instanceof Perro) {
				//primero iteramos sobre cada una de las vacunas de los perros
				
				for (VacunaPerro vacunaTipoPerro : VacunaPerro.values()) {
					boolean inyectarDosisEsencial= vacunaTipoPerro.esEsencial();
					if (inyectarDosisEsencial==true) { // si es esencial, vamos a inyectarla.
						suministrarDosisEspecifica(vacunaTipoPerro,nuevoAnimal);
					}
				}
				
			}else {
				// iteramos sobre los gatos para inyectar las vacunas esenciales
				for (VacunaGato vacunaTipoGato : VacunaGato.values()) {
					boolean inyectarDosisEsencial= vacunaTipoGato.esEsencial();
					if (inyectarDosisEsencial==true) { // si es esencial, vamos a inyectarla.
						suministrarDosisEspecifica(vacunaTipoGato,nuevoAnimal);
					}
				}
			}
		}
		else
			System.out.println("Ese animal no se puede acoger");
	}
		
	
	// eliminamos un animal del refugio
	public void eliminarAnimal() {
		refugio.remove();
	}
	
	
	// reutilizamos el metodo suministrarDosisEspecifica, utilizando la fecha actual como parametro.
	public void suministrarDosisEspecifica(Vacuna vacuna ,Animal animal) {
		suministrarDosisEspecifica(vacuna,animal,LocalDateTime.now());
	}
	
	private void suministrarDosisEspecifica(Vacuna vacuna ,Animal animal, LocalDateTime fecha) {
		Dosis dosisParaAdministrar= new Dosis(fecha, vacuna);
		animal.inyectarVacuna(dosisParaAdministrar);
	}
	
	public void mostrarRefugio() {
		Iterator<Animal> iterator = refugio.iterator();
			
		while (iterator.hasNext()) {
		    Animal animalEnRefugio = iterator.next();
		    System.out.println(animalEnRefugio.mostrarNombre());
		}
	}
		
	public Animal eliminarGato() {
		// recorremos la cola en busca de un gato.
		Iterator<Animal> iterator = refugio.iterator();
		Animal gatoEncontrado= new Gato("");
		
		while (iterator.hasNext()) {
		    gatoEncontrado = iterator.next();
		    if (gatoEncontrado instanceof Gato) {
			   	refugio.remove(gatoEncontrado);
		    	break;
		    }
		}
		return gatoEncontrado;
	}
		
	public Animal eliminarPerro() {
		// recorremos la cola en busca de un perro.
		Iterator<Animal> iterator = refugio.iterator();
		Animal perroEncontrado= new Perro("");

		while (iterator.hasNext()) {
		    perroEncontrado = iterator.next();
		    if (perroEncontrado instanceof Perro) {
		    	refugio.remove(perroEncontrado);
		    	break;
		    }
		}
		return perroEncontrado;
	}
	
	public void mostrarHistorialVacunas(Animal animalHistory) {
		System.out.println("----------------- HISTORIAL DE VACUNACION DE  " + animalHistory.mostrarNombre() +"-------------------"  );
		for(int i=0; i< animalHistory.getHistorialVacunacion().size(); i++) {
			System.out.println(animalHistory.getHistorialVacunacion().get(i).toString());
		}
		System.out.println("---------------------------------------------------------------------------------------");
	}


	public Queue<Animal> getRefugio() {
		return refugio;
	}


	public void setRefugio(Queue<Animal> refugio) {
		this.refugio = refugio;
	}
}
