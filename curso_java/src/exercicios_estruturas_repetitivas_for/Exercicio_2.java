package exercicios_estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro para determinar a quantidade");
		int numberTyped = sc.nextInt();
		int in = 0;
		int out = 0;
		int quantityOfNumbers = numberTyped;

		for (int i = 0; i < quantityOfNumbers; i++) {
			System.out.println("Digite um número inteiro");
			numberTyped = sc.nextInt();

			if (numberTyped >= 10 && numberTyped <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
