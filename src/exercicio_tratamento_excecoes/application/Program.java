package exercicio_tratamento_excecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import exercicio_tratamento_excecoes.model.entities.Account;
import exercicio_tratamento_excecoes.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)  {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawBalance = sc.nextDouble();

			Account acc = new Account(number, holder, balance, withdrawBalance);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			
			System.out.println(acc);
			sc.close();
		} catch (DomainException e) {
			System.err.println("Withdraw error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("Invalid input");
		}

	}

}
