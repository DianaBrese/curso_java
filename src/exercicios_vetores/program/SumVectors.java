package exercicios_vetores.program;

import java.util.Scanner;

public class SumVectors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which values each vector will have?");
		int n = sc.nextInt();
		int[] vectorA = new int[n];
		int[] vectorB = new int[n];
		
		System.out.println("Type the values for the vector A");
		for(int i = 0; i < vectorA.length; i++) {
			vectorA[i] = sc.nextInt();
		}
		
		System.out.println("Type the values for the vector B");
		for(int i = 0; i < vectorB.length; i++) {
			vectorB[i] = sc.nextInt();
		}
		
		
		System.out.println("VALOR RESULTANTE: ");
		for(int i = 0; i < n; i++) {
			System.out.println(vectorA[i] + vectorB[i] );
		}
		
		sc.close();

	}

}
