package exercicios_vetores.program;

import java.util.Scanner;

import exercicios_vetores.entities.Studants;

public class Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type the number of students that have rented a room: ");
		int n = sc.nextInt();

		Studants roomsInformations[] = new Studants[10];

		for (int i = 0; i < n; i++) {
			System.out.println("Type the student's name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Type the student's email: ");
			String email = sc.nextLine();

			System.out.println("Type the room's number: ");
			int roomNumber = sc.nextInt();

			roomsInformations[i] = new Studants(name, email, roomNumber);

		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (roomsInformations[i] != null) {
				System.out.println(roomsInformations[i].getRoomNumber() + ": " + roomsInformations[i].getName() + " , "
						+ roomsInformations[i].getEmail());
			}
		}

		sc.close();

	}

}
