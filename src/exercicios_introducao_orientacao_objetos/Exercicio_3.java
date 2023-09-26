package exercicios_introducao_orientacao_objetos;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
		 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
		 * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
		 * 60% da nota). Você deve criar uma classe Student para resolver este problema.
		 */

		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the student's name: ");
		student.name = sc.nextLine();
		
		System.out.println("Type the grade of the first quarter: ");
		student.firstQuarter = sc.nextDouble();
		
		System.out.println("Type the grade of the second quarter: ");
		student.secondQuarter = sc.nextDouble();
		
		System.out.println("Type the grade of the third quarter: ");
		student.thirdQuarter = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}

}
