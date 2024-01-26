package tratamento_excecoes.solucao_boa.application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import tratamento_excecoes.solucao_boa.model.entities.Reservation;
import tratamento_excecoes.solucao_boa.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			System.out.println("Room number");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), formatter);
			System.out.println("Check-out date (dd/MM/yyyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), formatter);

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), formatter);
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), formatter);

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}

		sc.close();
	}

}
