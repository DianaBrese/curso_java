package exercicios_introducao_orientacao_objetos_2;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.println("Is there an initial balance (y/n)?");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter inicial balance value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else if (response == 'n') {
			account = new Account(number, holder);
		}

		System.out.println("updated account data: ");
		System.out.println(account);
		
		System.out.println("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("updated account data: ");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("updated account data: ");
		System.out.println(account);
		
		
		

		sc.close();

	}

}
