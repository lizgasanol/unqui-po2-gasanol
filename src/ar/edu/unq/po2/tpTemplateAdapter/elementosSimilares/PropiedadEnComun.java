package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import java.util.Collections;

public class PropiedadEnComun extends Filtro {

	@Override
	protected Boolean isSimilar(WikipediaPage page1, WikipediaPage page2) {
		return !Collections.disjoint(page1.getInfobox().keySet(), page2.getInfobox().keySet());
	}

}
