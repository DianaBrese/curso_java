package exercicios_polimorfismo2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public UsedProduct() {
		super();
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	
	@Override
	public String priceTag() {
		String formattedDate = manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return getName() + "(used) $ " + String.format("%.2f", getPrice()) + "Manufacture date: " + formattedDate;
	}
}
