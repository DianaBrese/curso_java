package exercicios_estruturas_repetitivas_while;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Digite aqui os códigos dos combustíveis a aperte 4 para vizualizar o total.");
		int numberTyped = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(numberTyped < 4 || numberTyped > 5) {
			if(numberTyped == 1) {
				alcool++;
				numberTyped = sc.nextInt();
			} else if(numberTyped == 2) {
				gasolina++;
				numberTyped = sc.nextInt();
			} else if(numberTyped == 3) {
				diesel++;
				numberTyped = sc.nextInt();
			} else if(numberTyped > 5) {
				System.out.println("Digite um número válido");
				numberTyped = sc.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();

	}
}
