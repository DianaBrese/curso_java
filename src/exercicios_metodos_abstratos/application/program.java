package exercicios_metodos_abstratos.application;

import java.util.ArrayList;
import java.util.Scanner;

import exercicios_metodos_abstratos.entities.Circle;
import exercicios_metodos_abstratos.entities.Rectangle;
import exercicios_metodos_abstratos.entities.Shape;
import exercicios_metodos_abstratos.entities.entitiesEnums.Color;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of shapes:");
		Integer numberOfShapes = sc.nextInt();
		ArrayList<Shape> list = new ArrayList<>();

		for (int i = 0; i < numberOfShapes; i++) {
			System.out.println("Shape #" + (i + 1) + " data");
			System.out.print("Rectangle or Circle (r/c)");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (shape == 'r') {
				System.out.print("Width:");
				Double width = sc.nextDouble();
				System.out.print("Height:");
				Double height = sc.nextDouble();
				Rectangle rectangle = new Rectangle(color, width, height);
				list.add(rectangle);
			} else if (shape == 'c') {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				Circle circle = new Circle(color, radius);
				list.add(circle);
			} else {
				System.out.println("Please, type a valid value.");

			}

		}

		System.out.println("SHAPE AREAS:");
		for(Shape l : list ) {
			System.out.println(String.format("%.2f", l.area()));
		}
		sc.close();

	}

}
