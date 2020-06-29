package ar.edu.unq.po2.tp6.bancoYPrestamos;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Double sueldoNetoMensual;
	private Banco banco;
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldoNetoMensual, Banco banco) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setDireccion(direccion);
		this.setSueldoNetoMensual(sueldoNetoMensual);
		this.setBanco(banco);
	}
	
	public void solicitarCredito(SolicitudDeCredito s) {
		getBanco().registrarSolicitudDeCredito(s);
	}

	
	public Double calcularSueldoNetoAnual() {
		return getSueldoNetoMensual() * 12;
	}
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public Banco getBanco() {
		return banco;
	}

	private void setBanco(Banco banco) {
		this.banco = banco;
	}
	
}
