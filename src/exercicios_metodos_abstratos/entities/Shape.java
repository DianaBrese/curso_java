package exercicios_metodos_abstratos.entities;

import exercicios_metodos_abstratos.entities.entitiesEnums.Color;

public abstract class Shape {
private Color color;

public Shape(Color color) {
	this.color = color;
}

public Shape() {
}

public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}

public abstract  double area();
}

