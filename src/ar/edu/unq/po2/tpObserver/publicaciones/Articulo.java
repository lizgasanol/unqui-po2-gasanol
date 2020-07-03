package ar.edu.unq.po2.tpObserver.publicaciones;

import java.util.List;

public class Articulo {
	
	private String titulo;
	private List<String> autores;
	private String filiacion;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autores, String filiacion, String tipoDeArticulo, String lugarDePublicacion, List<String> palabrasClave) {
		this.setAutores(autores);
		this.setTitulo(titulo);
		this.setFiliacion(filiacion);
		this.setTipoDeArticulo(tipoDeArticulo);
		this.setLugarDePublicacion(lugarDePublicacion);
		this.setPalabrasClave(palabrasClave);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public void setFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public void setTipoDeArticulo(String tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public void setLugarDePublicacion(String lugarDePublicacion) {
		this.lugarDePublicacion = lugarDePublicacion;
	}

	public List<String> getPalabrasClave() {
		return palabrasClave;
	}

	public void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

	public boolean esInteresantePara(IObservadorArticulos ob) {
		return;
	}
	
	public boolean tituloCoincideConIntereses(List<String> intereses) {
		return intereses.stream().anyMatch(interes -> interes.equals(this.titulo));
	}
	
}
