package exercicios_vetores.program;

import java.util.Scanner;

public class HighestPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many numbers you'll type?");
		int n = sc.nextInt();
		double[] numbersList = new double[n];
		
		for(int i = 0; i < numbersList.length; i++) {
			System.out.println("Type a number: ");
			numbersList[i] = sc.nextDouble();
		}
		
		double max = numbersList[0];
		int indexMax = 0;
		for(int i = 0; i < numbersList.length; i++) {
			if(numbersList[i] > max) {
				max = numbersList[i];
				indexMax = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + max);
		System.out.println("POSIÇÃO DE MAIOR VALOR = " + indexMax);
		
		sc.close();

	}

}
