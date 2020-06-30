package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroTestCase {

	private WikipediaPage radiacion;
	private WikipediaPage chernobyl;
	private WikipediaPage castlevania;
	private WikipediaPage hbo;
	List<WikipediaPage> wikipedia;
	
	@BeforeEach
	void setUp() throws Exception {
		List<WikipediaPage> linksChernobyl = new ArrayList<WikipediaPage>();
		linksChernobyl.add(hbo);
		linksChernobyl.add(radiacion);
		
		List<WikipediaPage> linksHbo = new ArrayList<WikipediaPage>();
		linksHbo.add(chernobyl);
		linksHbo.add(radiacion);
		
		Map<String,WikipediaPage> infoboxCastlevania = new HashMap<String,WikipediaPage>();
		infoboxCastlevania.put("nivel", null); infoboxCastlevania.put("año", null);
		
		Map<String,WikipediaPage> infoboxRadiacion = new HashMap<String,WikipediaPage>();
		infoboxRadiacion.put("nivel",null); infoboxRadiacion.put("tipo", null);
		
		radiacion = mock(WikipediaPage.class);
		when(radiacion.getTitle()).thenReturn("Radiacion");
		when(radiacion.getLinks()).thenReturn(new ArrayList<WikipediaPage>());
		when(radiacion.getInfobox()).thenReturn(infoboxRadiacion);
		
		chernobyl = mock(WikipediaPage.class);
		when(chernobyl.getTitle()).thenReturn("Chernobyl");
		when(chernobyl.getLinks()).thenReturn(linksChernobyl);
		when(chernobyl.getInfobox()).thenReturn(new HashMap<String,WikipediaPage>());
		
		castlevania = mock(WikipediaPage.class);
		when(castlevania.getTitle()).thenReturn("Castlevania");
		when(castlevania.getLinks()).thenReturn(new ArrayList<WikipediaPage>());
		when(castlevania.getInfobox()).thenReturn(infoboxCastlevania);
		
		hbo = mock(WikipediaPage.class);
		when(hbo.getTitle()).thenReturn("HBO");
		when(hbo.getLinks()).thenReturn(linksHbo);
		when(hbo.getInfobox()).thenReturn(new HashMap<String,WikipediaPage>());
		
		
		wikipedia = new ArrayList<WikipediaPage>();
		wikipedia.add(castlevania);
		wikipedia.add(chernobyl);
		wikipedia.add(hbo);
		wikipedia.add(radiacion);
	}

	@Test
	void testFiltroMismaLetraInicial() {
		Filtro unFiltro = new MismaLetraInicial();
		
		assertEquals(unFiltro.getSimilarPages(chernobyl, wikipedia).size(), 1);
		assertTrue(unFiltro.getSimilarPages(chernobyl, wikipedia).contains(castlevania));
	}

	@Test
	void testFiltroLinkEnComun() {
		Filtro unFiltro = new LinkEnComun();
				
		assertEquals(unFiltro.getSimilarPages(chernobyl, wikipedia).size(), 1);
		assertTrue(unFiltro.getSimilarPages(chernobyl,wikipedia).contains(hbo));
	}
	
	@Test
	void testFiltroPropiedadEnComun() {
		Filtro unFiltro = new PropiedadEnComun();
		
		assertEquals(unFiltro.getSimilarPages(castlevania, wikipedia).size(), 1);
		assertTrue(unFiltro.getSimilarPages(castlevania,wikipedia).contains(radiacion));
	}
}
