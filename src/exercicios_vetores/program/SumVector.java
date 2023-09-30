package exercicios_vetores.program;

import java.util.Scanner;

public class SumVector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a quantity:");
		int n = sc.nextInt();
		double[] numbersList = new double[n];
		
		for(int i = 0; i < numbersList.length; i++) {
			System.out.println("Type a number: ");
			numbersList[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for( int i = 0; i < numbersList.length; i++) {
			sum += numbersList[i];
		}
		
		double avg = sum / numbersList.length;
		
		System.out.print("VALORES: ");
		for(int i = 0; i < numbersList.length; i++) {
			System.out.print(" " + numbersList[i] + "");
		}
		
		System.out.println();
		System.out.println("SOMA = " + sum);
		System.out.println("MEDIA = " + avg);
		sc.close();

	}

}
