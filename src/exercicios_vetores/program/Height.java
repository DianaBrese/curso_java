package exercicios_vetores.program;

import java.util.Scanner;

import exercicios_vetores.entities.Person;

public class Height {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many people will be typed? ");
		int n = sc.nextInt();
		Person[] person = new Person[n];

		for (int i = 0; i < person.length; i++) {
			System.out.println("Type the data of the " + (i + 1) + "st person: ");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Age: ");
			int age = sc.nextInt();
			System.out.println("Height: ");
			double height = sc.nextDouble();

			person[i] = new Person(name, age, height);
		}
		
		
		double sum = 0.0;
		for(int i = 0; i < person.length; i++) {
			sum += person[i].getHeight();
		}
		double avg = sum / n;
		
		System.out.printf("ALTURA MÉDIA: %.2f%n", avg);
		
		int underAge = 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getAge() < 16) {
				underAge += 1;
			}
		}
		
		double percentageUnderAge = underAge * 100 / person.length;
		System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.1f", percentageUnderAge);
		System.out.println("%");
		
		for(int i = 0; i < person.length; i++) {
			if(person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}

		sc.close();

	}

}
