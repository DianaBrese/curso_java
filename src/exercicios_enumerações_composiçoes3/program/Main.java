package exercicios_enumerações_composiçoes3.program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exercicios_enumerações_composiçoes3.entities.Client;
import exercicios_enumerações_composiçoes3.entities.Order;
import exercicios_enumerações_composiçoes3.entities.OrderItem;
import exercicios_enumerações_composiçoes3.entities.Product;
import exercicios_enumerações_composiçoes3.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterMoment = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY: )");
		String birth = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(birth, formatter);
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		OrderStatus statusEnum = OrderStatus.valueOf(status);
		Order order = new Order();
		
		String moment = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime productMoment = LocalDateTime.parse(moment, formatterMoment);
		order = new Order( productMoment, statusEnum, client);
		
		System.out.print("How many items to this order?");
		int itemsQuantity = sc.nextInt();
		for(int i = 0; i < itemsQuantity; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			order.addItem(orderItem);

		}
		
		System.out.println(order);
		
		sc.close();

	}

}
