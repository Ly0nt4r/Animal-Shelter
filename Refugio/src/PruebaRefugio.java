import java.time.LocalDateTime;

public class PruebaRefugio {
	public static void main(String[] args) {
		
		Animal marco= new Perro("Marco");
		Animal lassie= new Perro("Lassie");
		Animal tobby= new Perro("Tobby");
		Animal juana= new Gato("Juana");
		Animal carlos= new Gato("Carlos");
		Animal lola= new Gato("Lola");
		Animal canela= new Perro("Canela");
		Animal snoopy= new Perro("Snoopy");
		Animal felix= new Gato("Felix");
		Animal pluto= new Perro("Pluto");
		Animal garfield= new Gato("Garfield");
		
		
		Refugio elRefugioFeliz= new Refugio();
		
		//añadimos animales al refugio
		elRefugioFeliz.entrarAnimal(marco);
		System.out.println("Entra --> "+ marco.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(lassie);
		System.out.println("Entra --> "+ lassie.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(tobby);
		System.out.println("Entra --> "+ tobby.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(juana);
		System.out.println("Entra --> "+ juana.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(carlos);
		System.out.println("Entra --> "+ carlos.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(lola);
		System.out.println("Entra --> "+ lola.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(canela);
		System.out.println("Entra --> "+ canela.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(snoopy);
		System.out.println("Entra --> "+ snoopy.mostrarNombre());
		
		elRefugioFeliz.entrarAnimal(felix);
		System.out.println("Entra --> "+ felix.mostrarNombre());
		
		// eliminamos del refugio (adoptan) a los animales más antiguos.
		System.out.println("Sale --> " + elRefugioFeliz.eliminarGato().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarGato().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarGato().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarPerro().mostrarNombre());

		elRefugioFeliz.entrarAnimal(pluto);
		System.out.println("Entra --> "+ pluto.mostrarNombre());
		elRefugioFeliz.entrarAnimal(garfield);
		System.out.println("Entra --> "+ garfield.mostrarNombre());
		
		// paramos el tiempo
		try {
			Thread.sleep(60);
		}catch(InterruptedException ex){
			System.out.println("ERROR");
		}
		
		// suministramos la vacuna a Pluto
		try {
			elRefugioFeliz.suministrarDosisEspecifica(VacunaPerro.valueOf("CCORONAVIRUS"), pluto);
		}catch(IllegalArgumentException iae) {
			System.out.println("Esa vacuna no existe.");
		}
		
		// suministramos la vacuna a Garfield
		try {
			elRefugioFeliz.suministrarDosisEspecifica(VacunaGato.CCORONAVIRUS, garfield);
		}catch(IllegalArgumentException iae) {
			System.out.println("Esa vacuna no existe.");
		}
		
		// mostramos el historial de Garfield
		elRefugioFeliz.mostrarHistorialVacunas(garfield);
		System.out.println("Sale --> " + elRefugioFeliz.eliminarPerro().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarPerro().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarPerro().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarGato().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarPerro().mostrarNombre());
		System.out.println("Sale --> " + elRefugioFeliz.eliminarGato().mostrarNombre());
		
	}

}
