import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int number = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < number; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println("Soma: " + soma);
		sc.close();
	}
}
