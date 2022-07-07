import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dosis{
	
	private LocalDateTime fechaDosis;
	private Vacuna vacuna;//vacunaPerro :d
	
	public Dosis(LocalDateTime fechaDosis, Vacuna vacuna) {
		this.fechaDosis = fechaDosis;
		this.vacuna=vacuna;
	}

	public LocalDateTime getFechaDosis() {
		return fechaDosis;
	}

	public void setFechaDosis(LocalDateTime fechaDosis) {
		this.fechaDosis = fechaDosis;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}
	
	@Override
	public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return "Dosis (Fecha=" + fechaDosis.format(formatter) + ", vacuna=" + vacuna.nombre() + ")";
	}
	
}
