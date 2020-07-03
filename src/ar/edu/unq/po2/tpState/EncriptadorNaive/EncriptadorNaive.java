package ar.edu.unq.po2.tpState.EncriptadorNaive;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EncriptadorNaive implements IEncriptador{

	@Override
	public String encriptar(String string) {
		List<String> listaDePalabras = Arrays.asList(string.split(" "));
		Collections.reverse(listaDePalabras);
		
		return String.join(" ", listaDePalabras);
	}

	@Override
	public String desencriptar(String string) {
		List<String> listaDePalabras = Arrays.asList(string.split(" "));
		Collections.reverse(listaDePalabras);
		
		return String.join(" ", listaDePalabras);
	}

}
