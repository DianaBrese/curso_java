package exercicios_estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para calcular seu fatorial");

		int numberTyped = sc.nextInt();
		int result = numberTyped;

		for (int i = 0; i < numberTyped; i++) {

			if (numberTyped == 0 || numberTyped == 1) {
				result = 1;
			} else {
				result = result * (numberTyped - 1);
				numberTyped--;

			}

		}
		System.out.println(result);

		sc.close();

	}

}
