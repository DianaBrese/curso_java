package exercicios_introducao_orientacao_objetos;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
		 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
		 */

		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
		
		
		
		sc.close();
	}

}
