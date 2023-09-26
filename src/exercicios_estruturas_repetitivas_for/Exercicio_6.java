package exercicios_estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		/*Ler um número inteiro N e calcular todos os seus divisores.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para calcular seu divisor");
		int numberTyped = sc.nextInt();
		
		for(int i = 1; i <= numberTyped; i++) {
			if(numberTyped % i == 0) {
				System.out.println(i);
			} 
		}
		
		sc.close();

	}

}
