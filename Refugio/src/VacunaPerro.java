public enum VacunaPerro implements Vacuna{
	
	//creamos la enumeración de constantes.
	MOQUILLO("Moquillo",true,36),PARVOVIRUS("Parvovirus Canino",true,36),
	RABIA("Rabia",true,12),ADENOVIRUS("Adenovirus canino",true,36),
	CCORONAVIRUS("Coronavirus",false,0), LEPTOSPIRA("Leptopirosis",false,12);
	
	private String nombre;
	private boolean esencial;
	private Integer revacunacion;
	
	// constructor por parametros
	VacunaPerro(String nombre, boolean esencial, Integer revacunacion) {
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


	// implementamos los metodos impuestos por la interfaz "Vacuna"
	@Override
	public boolean esEsencial() {
		return this.esencial;
	}
	@Override
	public String nombre() {
		return this.nombre;
	}
}

