import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			System.out.println("Digite um número:");
			soma = soma + x ;
			 x = sc.nextInt(); 
		}
		
		System.out.println("Soma: " + soma);
		sc.close();
	}
}
