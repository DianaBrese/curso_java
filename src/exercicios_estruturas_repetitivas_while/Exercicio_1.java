package exercicios_estruturas_repetitivas_while;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha");
		
		int correctPassword = 2002;
		int inputedPassword = sc.nextInt();
		
		while(correctPassword != inputedPassword) {
			System.out.println("Senha inválida. Tente novamente");
			inputedPassword = sc.nextInt();
		};
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
