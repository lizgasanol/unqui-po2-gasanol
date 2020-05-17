package ar.edu.unq.po2.tp3;

import java.util.function.BooleanSupplier;

import ar.edu.unq.po2.tp3.Point;

public class Rectangulo {

	private Point origen;
	private int base;
	private int altura;
	
	public Rectangulo(Point origen, int base, int altura) {
		this.origen = origen;
		this.base = base;
		this.altura= altura;
	}

	public Integer area() {
		return this.base * this.altura;
	}

	public Integer perimetro() {
		return (this.base*2) + (this.altura*2);
	}

	public boolean esHorizontal() {
		return this.base > this.altura;
	}
}
