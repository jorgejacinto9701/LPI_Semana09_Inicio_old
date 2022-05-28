package entidad;

import java.sql.Date;

public class Director {

	private int idDirector;
	private String nombre;
	private Date fechaNacimiento;
	private Grado grado;
	private String gradoTexto;
	
	public String getGradoTexto() {
		gradoTexto = grado.getDescripcion();
		return gradoTexto;
	}
	public void setGradoTexto(String gradoTexto) {
		this.gradoTexto = gradoTexto;
	}
	public int getIdDirector() {
		return idDirector;
	}
	public void setIdDirector(int idDirector) {
		this.idDirector = idDirector;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Grado getGrado() {
		return grado;
	}
	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	
	
}
