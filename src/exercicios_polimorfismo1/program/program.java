package exercicios_polimorfismo1.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios_polimorfismo1.entities.Employee;
import exercicios_polimorfismo1.entities.OutsourcedEmployee;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		Integer numberOfEmployees = sc.nextInt();
		System.out.println();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");

			System.out.print("Outsourced (y/n)?");
			char isOutsourced = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Hours: ");
			Integer hours = sc.nextInt();

			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();

			if (isOutsourced == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				System.out.println();

				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}

		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();

	}

}
