package exercicios_trabalhando_com_arquivos.model.entities;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double price, Integer quantity) throws IllegalArgumentException {
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Product name cannot be null or empty");
		}
		
		if(price == null || price <0.0) {
			throw new IllegalArgumentException("Product price cannot be null or negative");
		}
		
		if(quantity == null || quantity < 0) {
			throw new IllegalArgumentException("Product quantity cannot be null or negative");
		}
	
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return price * quantity;
	}
	
	
	@Override
	public String toString() {
		return getName() + "," + getPrice() + "," + getQuantity() +"\n";
	}
	
}
