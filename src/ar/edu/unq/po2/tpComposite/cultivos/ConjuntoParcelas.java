package ar.edu.unq.po2.tpComposite.cultivos;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoParcelas extends Cultivo{
	
	private List<Cultivo> cultivos = new ArrayList<Cultivo>();

	public ConjuntoParcelas(Cultivo cultivo1, Cultivo cultivo2, Cultivo cultivo3, Cultivo cultivo4) {
		this.agregarCultivo(cultivo1);
		this.agregarCultivo(cultivo2);
		this.agregarCultivo(cultivo3);
		this.agregarCultivo(cultivo4);
	}
	
	@Override
	public Integer getGananciaAnual() {
		Integer ret = 0;
		
		for (Cultivo c : this.cultivos) {
			ret += c.getGananciaAnual() / 4;
		}
		
		return ret;
	}
	
	@Override
	public void agregarCultivo(Cultivo cultivo) {
		if(this.cultivos.size() < 4) {
			this.cultivos.add(cultivo);
		}
	}
}
