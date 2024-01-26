package exercicios_trabalhando_com_arquivos.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import exercicios_trabalhando_com_arquivos.model.entities.Product;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		String inputFilePath = "C:\\temp";
		String outputFilePath = "C:\\temp\\products.csv";
		String path = null;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

			ArrayList<Product> list = new ArrayList<>();

			System.out.println("How many items will you type?");
			int items = sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < items; i++) {
				System.out.println("Item #" + (i + 1) + ":");
				System.out.print("Product name: ");
				String name = sc.nextLine();
				System.out.print("Unity price: ");
				Double price = sc.nextDouble();
				System.out.print("Quantity: ");
				Integer quantity = sc.nextInt();
				sc.nextLine();
				Product product = new Product(name, price, quantity);
				list.add(product);
			}

			int writingSuccess = 0;
			for (Product product : list) {
				String csvLine = String.format("%s, %.2f, %d", product.getName(), product.getPrice(),
						product.getQuantity());
				bw.write(csvLine);
				bw.newLine();
				writingSuccess += 1;
				if (writingSuccess == list.size()) {
					System.out.println("File created sucessfully");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Create new folder with file details? y/n");
		char create = sc.next().charAt(0);
		if (create == 'y') {
			new File(inputFilePath + "\\out").mkdir();
			path = inputFilePath + "\\out\\summary.csv";
		}
		try (BufferedWriter nbw = new BufferedWriter(new FileWriter(path));
				BufferedReader br = new BufferedReader(new FileReader(outputFilePath))) {
			ArrayList<Product> finalProduct = new ArrayList<>();
			String itemCsv = br.readLine();

			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1].trim());
				Integer quantity = Integer.parseInt(fields[2].trim());
				finalProduct.add(new Product(name, price, quantity));
				itemCsv = br.readLine();
			}
			
			int writingSuccess = 0;
			for(Product p : finalProduct) {
				String csvLine = String.format("%s, %.2f", p.getName(), p.total());
				nbw.write(csvLine);
				nbw.newLine();
				writingSuccess += 1;
				if (writingSuccess == finalProduct.size()) {
					System.out.println("File created sucessfully");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}

}
