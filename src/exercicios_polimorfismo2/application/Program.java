package exercicios_polimorfismo2.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios_polimorfismo2.entities.ImportedProduct;
import exercicios_polimorfismo2.entities.Product;
import exercicios_polimorfismo2.entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of products: ");
		Integer numberOfProducts = sc.nextInt();
		List<Product> list = new ArrayList<>();

		for (int i = 0; i < numberOfProducts; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)");
			char type = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (type == 'c') {
				Product product = new Product(name, price);
				list.add(product);
				System.out.println();
			}
			if (type == 'u') {
				System.out.print("Manufacture date: (DD/MM/YYYY)");
				sc.nextLine();
				String date = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate manufacturedDate = LocalDate.parse(date, formatter);
				Product product = new UsedProduct(name, price, manufacturedDate);
				list.add(product);
				System.out.println();

			}
			if (type == 'i') {
				System.out.print("Customs fee:");
				Double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
				System.out.println();
			}

		}
		System.out.println("PRICE TAGS: ");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}
