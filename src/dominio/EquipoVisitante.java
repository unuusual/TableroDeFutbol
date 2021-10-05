package dominio;

public class EquipoVisitante {
	private String nombre;
	private Integer golVisitante = 0;
	private Integer mostrarGolesVisitantes;
	
	public EquipoVisitante(String nombre) {
		this.nombre = nombre;
		this.golVisitante = golVisitante;
		this.mostrarGolesVisitantes = mostrarGolesVisitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getGolVisitante() {
		return golVisitante++;
	}


	public Integer setGolVisitante(Integer golVisitante) {
		return this.golVisitante = golVisitante;
	}
	@Override
	public String toString() {
		return nombre;
	}

	
	
	
	

	
	
}
