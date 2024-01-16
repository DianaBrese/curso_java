package exercicios_metodos_abstratos2.entities;

public class Company extends TaxPayer {
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double taxes() {
		Double taxToPay;
		
		if(getNumberOfEmployees() < 10) {
			taxToPay = (getAnualIncome() * 16/100);
		} else {
			taxToPay = (getAnualIncome() * 14/100);
		}
		return taxToPay;	
	}
}
