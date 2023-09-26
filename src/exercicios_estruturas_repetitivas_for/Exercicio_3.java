package exercicios_estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Determine a quantidade de testes que queira fazer");
		int numberTyped = sc.nextInt();
		int quantityOfTests = numberTyped;

		for (int i = 0; i < quantityOfTests; i++) {
			System.out.println("Digite o valor real desejado");
			double numberA = sc.nextDouble();
			double numberB = sc.nextDouble();
			double numberC = sc.nextDouble();

			double result = ((numberA * 2) + (numberB * 3) + (numberC * 5)) / (2 + 3 + 5);
			System.out.printf("%.1f%n", result);
		}

		sc.close();

	}

}
