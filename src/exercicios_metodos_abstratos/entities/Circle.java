package exercicios_metodos_abstratos.entities;

import exercicios_metodos_abstratos.entities.entitiesEnums.Color;

public class Circle extends Shape {
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;

	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.14 * Math.pow(radius,2);
	}

}
