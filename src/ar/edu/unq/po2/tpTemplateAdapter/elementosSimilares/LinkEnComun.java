package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;


import java.util.Collections;


public class LinkEnComun extends Filtro {

	@Override
	protected Boolean isSimilar(WikipediaPage page1, WikipediaPage page2) {
		return !Collections.disjoint(page1.getLinks(), page2.getLinks());
	}

}
