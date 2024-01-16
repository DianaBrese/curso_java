package exercicios_polimorfismo2.entities;

public class Product {
	private String name;
	protected Double price;
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
	
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", getPrice());
	}
}
