package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double calculateArea() {
		double p = (a + b + c) / 2.0;
		double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return areaTriangle;
	}
}

