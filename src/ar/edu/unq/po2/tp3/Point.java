package ar.edu.unq.po2.tp3;

public class Point {

	private int valorX;
	private int valorY;
	
	public Point() {
		this.valorX = 0;
		this.valorY = 0;
	}
	
	public Point(int x, int y) {
		this.valorX = x;
		this.valorY = y;
	}

	public Integer getX() {
		return valorX;
	}

	public Integer getY() {
		return valorY;
	}

	public void move(int x, int y) {
		valorX = x;
		valorY = y;
	}

	public Point addPoint(Point otroPunto) {
		return new Point(this.getX() + otroPunto.getX(),this.getY() + otroPunto.getY());
	}
	
}
