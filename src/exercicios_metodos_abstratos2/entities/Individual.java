package exercicios_metodos_abstratos2.entities;

public class Individual extends TaxPayer {
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxes() {
		Double taxesToPay;

		if (getAnualIncome() < 20000.00) {
			if (getHealthExpenditures() != 0) {
				taxesToPay = (getAnualIncome() * 15 / 100) - (getHealthExpenditures() * 50 / 100);
			} else {
				taxesToPay = (getAnualIncome() * 15 / 100);
			}
		} else {
			if (getHealthExpenditures() != 0) {
				taxesToPay = (getAnualIncome() * 25 / 100) - (getHealthExpenditures() * 50 / 100);
			} else {
				taxesToPay = (getAnualIncome() * 25 / 100);
			}
		}
		return taxesToPay;
	}

}
