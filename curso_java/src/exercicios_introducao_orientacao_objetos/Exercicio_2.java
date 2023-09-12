package exercicios_introducao_orientacao_objetos;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
		 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
		 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
		 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
		 * mostrar novamente os dados do funcionário.
		 */
		
		Employee employee = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, type your full name:");
		employee.name = sc.nextLine();
		System.out.println("Type your gross salary:");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Type the value of your tax:");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Updated data: " + employee);
		
		
		sc.close();
	}

}
