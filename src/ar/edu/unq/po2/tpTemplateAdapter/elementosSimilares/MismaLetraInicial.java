package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

public class MismaLetraInicial extends Filtro{

	@Override
	protected Boolean isSimilar(WikipediaPage page1, WikipediaPage page2) {
		return page1.getTitle().charAt(0) == page2.getTitle().charAt(0);
	}
}
