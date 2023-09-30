package exercicios_vetores.program;

import java.util.Scanner;

public class BellowTheAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements the vector is going to have?");
		int n = sc.nextInt();
		double[] numbersList = new double[n];
		
		for(int i = 0; i < numbersList.length; i++) {
			System.out.println("Type a number: ");
			numbersList[i] = sc.nextDouble();
		}
	
		double sum = 0.0;
		for(int i = 0; i < numbersList.length; i++) {
			sum += numbersList[i];
		}
		double avg = sum / numbersList.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f\n", avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < numbersList.length; i++) {
			if(numbersList[i] < avg) {
				System.out.println(numbersList[i]);
			}
		}
		
		sc.close();
	}

}
