package exercicios_vetores.program;

import java.util.Scanner;

import exercicios_vetores.entities.People;

public class PeopeData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many people will be typed?");
		int n = sc.nextInt();
		People[] people = new People[n];

		for (int i = 0; i < people.length; i++) {
			System.out.println("Height of the " + (i + 1) + "st person");
			double height = sc.nextDouble();
			System.out.println("Genre of the " + (i + 1) + "st person");
			char genre = sc.next().charAt(0);

			people[i] = new People(height, genre);
		}

		double minHeight = people[0].getHeight();
		for (int i = 0; i < people.length; i++) {
			if (people[i].getHeight() < minHeight) {
				minHeight = people[i].getHeight();
			}
		}
		System.out.printf("Menor altura %.2f\n", minHeight);

		double maxHeight = people[0].getHeight();
		for (int i = 0; i < people.length; i++) {
			if (people[i].getHeight() > maxHeight) {
				maxHeight = people[i].getHeight();
			}
		}
		System.out.printf("Maior altura %.2f\n", maxHeight);

		double sum = 0.0;
		int totalWomen = 0;
		int totalMen = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getGenre() == 'F'|| people[i].getGenre() == 'f') {
				sum += people[i].getHeight();
				totalWomen += 1;
			} else {
				totalMen += 1;
			}
		}
		double avgWomen = sum / totalWomen;
		System.out.printf("MEDIA DAS ALTURAS DAS MULHERES %.2f\n", avgWomen);
		System.out.println("NUMERO DE HOMENS = " + totalMen);
		
		
	
		

		sc.close();

	}

}
