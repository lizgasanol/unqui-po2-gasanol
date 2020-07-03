package ar.edu.unq.po2.tpState.EncriptadorNaive;

public class EncriptadorVocales implements IEncriptador {

	@Override
	public String encriptar(String string) {
		String ret = "";
		
		for(char c : string.toCharArray()) {
			ret += this.siguienteVocal(c);
		}
		
		return ret;
	}

	private char siguienteVocal(char c) {
		char ret = c;

		switch(c) {
		case 'a':
			ret = 'e';
			break;
		case 'e':
			ret = 'i';
			break;
		case 'i':
			ret = 'o';
			break;
		case 'o':
			ret = 'u';
			break;
		case 'u':
			ret = 'a';
			break;
		}
		
		return ret;

	}

	@Override
	public String desencriptar(String string) {
		String ret = "";
		
		for(char c : string.toCharArray()) {
			ret += this.anteriorVocal(c);
		}
		
		return ret;
	}

	private char anteriorVocal(char c) {
		char ret = c;
		switch(c) {
		case 'a':
			ret = 'u';
			break;
		case 'e':
			ret = 'a';
			break;
		case 'i':
			ret = 'e';
			break;
		case 'o':
			ret = 'i';
			break;
		case 'u':
			ret = 'o';
			break;
		}
		
		return ret;
	}

}
