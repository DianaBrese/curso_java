package exercicios_matrizes.application;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type the value o X e Y");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] matrix = new int[x][y];

		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("Pay attention! Enter %d values to set on the row %d %n", y, i);
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("See how is your matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				System.out.print("    ");

			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Enter the value in the matrix you want to see the position");
		int position = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (position == matrix[i][j]) {
					System.out.println("Position " + i + "," + j + ":");

					if (checkArray(matrix, i, (j - 1))) {
						System.out.println("Left: " + (matrix[i][j - 1]));
					}

					if (checkArray(matrix, i, (j + 1))) {
						System.out.println("Right: " + (matrix[i][j + 1]));
					}

					if (checkArray(matrix, (i - 1), j)) {
						System.out.println("Up: " + (matrix[i - 1][j]));
					}

					if (checkArray(matrix, (i + 1), j)) {
						System.out.println("Down: " + (matrix[i + 1][j]));
					}

				}

			}
		}
		sc.close();
	}

	public static boolean checkArray(int[][] matrix, int positionX, int positionY) {

		for (int i = 0; i < matrix.length; i++) {
			if (i == positionX) {
				if (matrix[i].length > positionY) {
					return true;
				}
			}

		}
		return false;

	}

}
