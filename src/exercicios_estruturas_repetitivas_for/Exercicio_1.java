package exercicios_estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 1 e 1000");
		int numberTyped = sc.nextInt();

		for (int i = 0; i <= numberTyped; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
