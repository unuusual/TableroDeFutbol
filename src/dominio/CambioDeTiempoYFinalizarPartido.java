package dominio;

public class CambioDeTiempoYFinalizarPartido {
	private Boolean empezarPartido = true;
	private Boolean finalizarPartido;
	private String primerTiempo = "Primer Tiempo";
	private String segundoTiempo = "Segundo Tiempo";
	private Boolean finalizarPrimerTiempo;
	

	public CambioDeTiempoYFinalizarPartido() {
		super();
		this.empezarPartido = empezarPartido;
		this.finalizarPartido = finalizarPartido;
		this.finalizarPrimerTiempo = finalizarPrimerTiempo;
		this.primerTiempo = primerTiempo;
	}

	public String getPrimerTiempo() {
		return primerTiempo;
	}

	public String setPrimerTiempo(String primerTiempo) {
		return this.primerTiempo = primerTiempo;
	}

	public Boolean getEmpezarPartido() {
		return empezarPartido;
	}

	public void setEmpezarPartido(Boolean empezarPartido) {
		this.empezarPartido = empezarPartido;
	}

	public Boolean getFinalizarPartido() {
		return finalizarPartido;
	}

	public void setFinalizarPartido(Boolean finalizarPartido) {
		this.finalizarPartido = finalizarPartido;
	}

	public Boolean getFinalizarPrimerTiempo() {
		return finalizarPrimerTiempo;
	}

	public void setFinalizarPrimerTiempo(Boolean finalizarPrimerTiempo) {
		this.finalizarPrimerTiempo = finalizarPrimerTiempo;
	}

	public String getSegundoTiempo() {
		return segundoTiempo;
	}

	public String setSegundoTiempo(String segundoTiempo) {
		this.segundoTiempo = segundoTiempo;
		return segundoTiempo;
	}

	
}
