package saida_de_dados;
import java.util.Locale;

public class Exercicio_Saida_Dados {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is R$ %.2f%n%s, wich price is R$ %.2f%n", product1, price1, product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("PT-BR decimal point: %.3f%n", measure);
	}

}
