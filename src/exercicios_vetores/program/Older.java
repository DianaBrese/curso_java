package exercicios_vetores.program;

import java.util.Scanner;

public class Older {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many people you will type?");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] age = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Data of the " + (i + 1) + "st person");

			System.out.println("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();

			System.out.println("Age: ");
			age[i] = sc.nextInt();
		}

		int max = age[0];
		String oldestPerson = null;
		for(int i = 0; i < n ; i++) {
			if(max < age[i]) {
				max = age[i];
				oldestPerson = name[i];
			}
		}
		
		System.out.println("OLDEST PERSON: " + oldestPerson);

		sc.close();

	}

}
