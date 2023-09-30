package exercicios_vetores.program;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type the quantity of numbers maximum 10");
		int n = sc.nextInt();

		int[] numbersList = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Type a number: ");
			numbersList[i] = sc.nextInt();
		}

		System.out.println("NEGATIVE NUMBERS: ");
		for (int i = 0; i < numbersList.length; i++) {
			if (numbersList[i] < 0) {

				System.out.println(numbersList[i]);
			}
		}
		sc.close();
	}

}
