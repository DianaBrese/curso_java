package exercicios_vetores.program;

import java.util.Scanner;

public class EvenAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many elements the vector in going to have?");
		int n = sc.nextInt();
		int[] numbersList = new int[n];

		for (int i = 0; i < numbersList.length; i++) {
			System.out.println("Type a number: ");
			numbersList[i] = sc.nextInt();
		}

		int sum = 0;
		int evenNumbers = 0;
		for (int i = 0; i < numbersList.length; i++) {
			if (numbersList[i] % 2 == 0) {
				sum += numbersList[i];
				evenNumbers += 1;
			}
		}

		if (evenNumbers == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double avg = sum / evenNumbers;
			System.out.printf("MEDIA DOS PARES = %.1f\n", avg);
		}

		sc.close();

	}

}
