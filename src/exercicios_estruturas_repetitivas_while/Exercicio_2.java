package exercicios_estruturas_repetitivas_while;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma coordenada");
		int coordX = sc.nextInt();
		int coordY = sc.nextInt();

		while (coordX != 0 && coordY != 0) {

			if (coordX > 0 && coordY > 0) {
				System.out.println("Primeiro");
			} else if (coordX < 0 && coordY > 0) {
				System.out.println("Segundo");
			} else if (coordX < 0 && coordY < 0) {
				System.out.println("Terceiro");
			} else if (coordX > 0 && coordY < 0) {
				System.out.println("Quarto");
			}

			coordX = sc.nextInt();
			coordY = sc.nextInt();
		}

		sc.close();
	}

}
