package exercicios_estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel"
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de vezes que quer calcular");
		
		int numberTyped = sc.nextInt();
		int quantityOfTest = numberTyped;
		
		for( int i = 0; i < quantityOfTest; i++) {
				
			System.out.println("Digite dois números");
			
			double numberA = sc.nextInt();
			double numberB = sc.nextInt();
			
			if(numberB == 0) {
				System.out.println("Divisão Impossível");
			} else {
				System.out.println(numberA/numberB);
			}
		}
		
		sc.close();

	}

}
