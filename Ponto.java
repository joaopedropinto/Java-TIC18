package ponto;

public class Ponto {
	
	private double x;
	private double y;
	
	Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double CalcularDistancia() {
		return Math.sqrt(x*x + y*y);
	}
}
