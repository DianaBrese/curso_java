package entities;

import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter the product name:");
		product.name = sc.nextLine();
		
		System.out.println("Enter it's price:");
		product.price =  sc.nextDouble();
		
		System.out.println("Enter the quantity available in stock");
		product.quantity = sc.nextInt();
		
		double total = product.totalValueInStock();
		
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be added in stock:");
		int quantityAdded = sc.nextInt();
		product.addProducts(quantityAdded);
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be added in stock:");
		int quantityRemoved = sc.nextInt();
		product.removeProducts(quantityRemoved);
		System.out.println(product.toString());
		
		
		
		sc.close();

	}

}
