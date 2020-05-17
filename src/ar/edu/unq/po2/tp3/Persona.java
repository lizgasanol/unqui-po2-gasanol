package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String n, String a ,LocalDate f) {
		nombre = n;
		apellido = a;
		fechaDeNacimiento = f;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int getEdad() {
		return (Period.between(fechaDeNacimiento, LocalDate.now())).getYears();
	}
	
	public boolean menorQue(Persona otraPersona) {
		return this.getEdad() < otraPersona.getEdad();
	}
}
