package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import java.util.List;
import java.util.Map;

public class WikipediaPage {

	private String title;
	private List<WikipediaPage> links;
	private Map<String,WikipediaPage> infobox;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<WikipediaPage> getLinks() {
		return links;
	}
	
	public void setLinks(List<WikipediaPage> links) {
		this.links = links;
	}
	
	public Map<String, WikipediaPage> getInfobox() {
		return infobox;
	}
	
	public void setInfobox(Map<String, WikipediaPage> infobox) {
		this.infobox = infobox;
	}
}
