package exercicios_estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo");
		int numberTyped = sc.nextInt();
		
		for(int i = 1; i <= numberTyped; i++) {
			int aoQuadrado = (int) Math.pow(i, 2);
			int aoCubo = (int) Math.pow(i, 3);
			
			System.out.println(i + " " + aoQuadrado + " " + aoCubo);
			
		}
		
		sc.close();
	}

}
