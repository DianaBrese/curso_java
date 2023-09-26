package exercicios_membros_estaticos;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {

		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
		 * responsável pelos cálculos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(amount, dollarPrice)  );
		
		sc.close();
	}
}
