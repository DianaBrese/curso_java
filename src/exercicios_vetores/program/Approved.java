package exercicios_vetores.program;

import java.util.Scanner;

public class Approved {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students will be typed?");
		int n = sc.nextInt();
		String[] name = new String[n];
		double[] firstSemester = new double[n];
		double[] secondSemester = new double[n];
		double[] avg = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Type the name, the first and second grades of the " + (i + 1) + "st student");
			sc.nextLine();
			name[i] = sc.nextLine();
			firstSemester[i] = sc.nextDouble();
			secondSemester[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < n; i++) {
			avg[i] = (firstSemester[i] + secondSemester[i]) / 2;
		}
		
		System.out.println("Approved Students");
		for(int i = 0; i < n; i++) {
			if(avg[i] >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		
		
		sc.close();
	}

}
