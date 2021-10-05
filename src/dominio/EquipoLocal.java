package dominio;

public class EquipoLocal {
	private String nombre;
	private Integer golLocal = 0;
	private Integer sumarGol;

	public EquipoLocal(String nombre) {
		this.nombre = nombre;
		this.golLocal = golLocal;
		this.sumarGol = sumarGol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Integer getGolLocal() {
		return golLocal++;
	}

	public Integer setGolLocal(Integer golLocal) {
		return this.golLocal = golLocal;
	}

	@Override
	public String toString() {
		return nombre ;
	}
	

}
