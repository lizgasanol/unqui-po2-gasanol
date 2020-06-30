package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> ret = new ArrayList<WikipediaPage>();
		
		for (WikipediaPage p : wikipedia) {
			if (this.isSimilar(page, p)) {
				ret.add(p);
			}
		}
		
		ret.remove(page);
		
		return ret;
	}
	
	protected abstract Boolean isSimilar(WikipediaPage page1, WikipediaPage page2);
}
