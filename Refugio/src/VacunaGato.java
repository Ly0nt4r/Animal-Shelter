public enum VacunaGato implements Vacuna{
	
	HERPES("Herpes Felino Tipo 1",true,36),CALICIVIRUS("Calicivirus Felino",true,36),
	PANLEUCOPENIA("Panleucopenia Felina",true,36),CCORONAVIRUS("Coronavirus",false,0),
	PERITONITIS("Peritonitis Infecciosa Felina",false,12);
	
	private String nombre;
	private boolean esencial;
	private Integer revacunacion;
	
	// constructor por parametros
	VacunaGato(String nombre, boolean esencial, Integer revacunacion) {
		this.nombre=nombre;
		this.esencial=esencial;
		this.revacunacion=revacunacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsencial() {
		return esencial;
	}

	public void setEsencial(boolean esencial) {
		this.esencial = esencial;
	}

	public Integer getRevacunacion() {
		return revacunacion;
	}

	public void setRevacunacion(Integer revacunacion) {
		this.revacunacion = revacunacion;
	}

	@Override
	public boolean esEsencial() {
		return esencial;
	}

	@Override
	public String nombre() {
		return nombre;
	}
	
	
}
