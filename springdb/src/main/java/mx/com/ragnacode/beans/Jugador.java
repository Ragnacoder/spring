package mx.com.ragnacode.beans;

public class Jugador {
	
	private int identificador;
	private String nombre;
	private Equipo equipo;
	private Camiseta camiseta;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}
	
	

}
