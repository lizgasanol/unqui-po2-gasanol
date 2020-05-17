package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> integrantes; 
	
	public EquipoDeTrabajo(String n) {
		nombre = n;
		integrantes = new ArrayList<Persona>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Persona> getIntegrantes(){
		return integrantes;
	}

	public void agregarIntegrante(Persona unaPersona) {
		integrantes.add(unaPersona);
	}

	public Integer edadPromedio() {
		ArrayList<Integer> listaDeEdades = this.getListaDeEdades();
		int sum = 0;
		for (int x : listaDeEdades) {
			sum += x;
		}
		return sum / listaDeEdades.size();
	}
// CRINGE CRINGE CRINGE CRINGE
	private ArrayList<Integer> getListaDeEdades() {
		ArrayList<Integer> listaDeEdades = new ArrayList<Integer>();
		for (Persona persona : integrantes) {
			listaDeEdades.add(persona.getEdad());
		}
		return listaDeEdades;
	}
}

