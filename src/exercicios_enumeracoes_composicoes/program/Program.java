package exercicios_enumeracoes_composicoes.program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exercicios_enumeracoes_composicoes.entities.Department;
import exercicios_enumeracoes_composicoes.entities.HourContract;
import exercicios_enumeracoes_composicoes.entities.Worker;
import exercicios_enumeracoes_composicoes.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		Department department = new Department(departmentName);
		System.out.println();

		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		System.out.println();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, department);

		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = sc.nextInt();
		System.out.println();

		for (int i = 0; i < numberOfContracts; i++) {
			System.out.println("Enter contract " + (i + 1) + " data ");
			System.out.print("Date (DD/MM/YYYY): ");
			sc.nextLine();
			String dateContract = sc.nextLine();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration: ");
			int duration = sc.nextInt();
			System.out.println();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateContractFormatted = LocalDate.parse(dateContract, formatter);
			HourContract hourContract = new HourContract(dateContractFormatted, valuePerHour, duration);
			worker.addContract(hourContract);
		}

		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		sc.nextLine();
		String dateToCalculate = sc.nextLine();
		String[] monthAndYearApart = dateToCalculate.split("/");
		Double totalValue = worker.income(Integer.valueOf(monthAndYearApart[0]), Integer.valueOf(monthAndYearApart[1]));
		System.out.println();
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());

	

		System.out.println("Income for " + dateToCalculate + ": " + String.format("%.2f", totalValue));

		sc.close();
	}

}
