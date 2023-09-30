package exercicios_vetores.program;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers you'll type?");
		int n = sc.nextInt();
		int[] numbersList = new int[n];
		
		for(int i = 0; i < numbersList.length; i++) {
			System.out.println("Type a number: ");
			numbersList[i] = sc.nextInt();
		}
		
		System.out.println("EVEN NUMBERS:");
		int evenCounter = 0;
		for(int i = 0; i < numbersList.length; i++) {
			if(numbersList[i] % 2 == 0) {
				System.out.print(" " + numbersList[i] + " ");
				evenCounter += 1;
			}
		}
		
		System.out.println();
		System.out.println("QUANTITY OF EVENS: " + evenCounter);
		
		sc.close();

	}

}
