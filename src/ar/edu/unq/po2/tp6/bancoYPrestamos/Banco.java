package ar.edu.unq.po2.tp6.bancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void registrarSolicitudDeCredito(SolicitudDeCredito s) {
		this.solicitudesDeCredito.add(s);
	}
	
	public List<SolicitudDeCredito> getSolicitudesDeCredito(){
		return this.solicitudesDeCredito;
	}
}
