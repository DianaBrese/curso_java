package exercicios_metodos_abstratos2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios_metodos_abstratos2.entities.Company;
import exercicios_metodos_abstratos2.entities.Individual;
import exercicios_metodos_abstratos2.entities.TaxPayer;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers:");
		int numberOfTaxPayer = sc.nextInt();
		
		for(int i = 0; i < numberOfTaxPayer; i++) {
			System.out.println("Tax payer #" + (i +1) + " data:");
			System.out.print("Individual or company? (i/c)?");
			char type = sc.next().charAt(0);
		
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income:");
			Double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				Individual individual = new Individual(name, anualIncome, healthExpenditures);
				list.add(individual);
				System.out.println();
			} if(type == 'c') {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				Company company = new Company(name, anualIncome, numberOfEmployees);
				list.add(company);
				System.out.println();
			}
		}
		
		System.out.println("TAXES PAID:");
		double totalTaxes = 0;
		for(TaxPayer l : list) {
			System.out.println(l.getName() + ": $" + String.format("%.2f", l.taxes()));
			totalTaxes += l.taxes();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
