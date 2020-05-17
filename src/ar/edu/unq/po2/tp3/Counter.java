package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public void addNumber(int i) {
		Integer x = i;
		lista.add(x);
	}

	public boolean isEven(Integer i) {
		return (i % 2) == 0;
	}
	
	public int getEvenOcurrences() {
		int counter = 0;
		for(Integer i : lista) {
			if (isEven(i)) {
				counter++;
			}
		}
		return counter;
	}

	public int getOddOcurrences() {
		int counter = 0;
		for(Integer i : lista) {
			if (!isEven(i)) {
				counter++;
			}
		}
		return counter;
	}

	public boolean isMultiple(Integer x, int y) {
		return x % y == 0;
	}
	public int getMultiplesOf(int i) {
		int counter = 0;
		for(Integer e : lista) {
			if (isMultiple(e,i)) {
				counter++;
			}
		}
		return counter;
	}
	
}
