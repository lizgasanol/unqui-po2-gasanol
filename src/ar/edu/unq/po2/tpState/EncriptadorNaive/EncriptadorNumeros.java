package ar.edu.unq.po2.tpState.EncriptadorNaive;


public class EncriptadorNumeros implements IEncriptador {

//	private char[] tabla = {' ','a','b','c','d','e','f','g','h','y','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	@Override
	public String encriptar(String string) {
		String ret = "";
		
		for (char c : string.toCharArray()) {
			ret += " abcdefghijklmnñopqrstuvwxyz".indexOf(c) + ",";
		}

		return ret.substring(0,ret.length()-1);
	}

	@Override
	public String desencriptar(String string) {
		String ret = "";
		String[] temp = string.split(",");
		
		for(String numero : temp) {
			ret += " abcdefghijklmnñopqrstuvwxyz".charAt(Integer.parseInt(numero));
		}
		return ret;
	}

}
