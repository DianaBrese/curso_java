package exercicios_estruturas_condicionais;
import java.util.Scanner;

public class Exercicio_Estruturas_Condicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * //(1)Saber se o número é negativo ou não
		 * System.out.println("Digite um número para saber se ele é negativo ou não");
		 * long isNumberNegative = sc.nextLong();
		 * 
		 * if(isNumberNegative < 0) {
		 * System.out.println("O número digitado é NEGATIVO"); } else {
		 * System.out.println("O número digitado NÃO É NEGATIVO"); }
		 */

		/*
		 * //(2)Saber se o número é par ou impar
		 * System.out.println("Digite um número para saber se ele é par ou impar"); long
		 * isNumberEven = sc.nextLong();
		 * 
		 * if(isNumberEven % 2 == 0) { System.out.println("O número digitado é PAR."); }
		 * else { System.out.println("O número digitado é IMPAR."); }
		 */

		/*
		 * //(3)Saber se dois dígitos são múltiplos entre si System.out.
		 * println("Digite dois números para saber se eles são múltiplos entre si"); int
		 * numberMulti1 = sc.nextInt(); int numberMulti2 = sc.nextInt();
		 * 
		 * if (numberMulti1 % numberMulti2 == 0 || numberMulti2 % numberMulti1 == 0) {
		 * System.out.println("Os números são múltiplos entre si"); } else {
		 * System.out.println("Os números NÃO são múltiplos entre si"); }
		 */

		/*
		 * //(4)Digite a hora que o jogo começou e terminou para saber quanto tempo
		 * durou System.out.println("Digite a hora de início e término do jogo"); int
		 * startHour = sc.nextInt(); int endHour = sc.nextInt(); int totalTime = 0;
		 * 
		 * if(endHour < startHour) { totalTime = 24 - startHour + endHour; } else
		 * if(startHour == endHour) { totalTime = 24; } else { totalTime = (startHour -
		 * endHour) * -1; }
		 * 
		 * 
		 * System.out.println("O jogo durou " + totalTime + " horas");
		 */

		/*
		// (5) Calcular preço de itens
		System.out.println("Digite o código e a quantidade dos itens para saber o valor");
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;
		int itemCod = sc.nextInt();
		int itemQuant = sc.nextInt();
		double totalPrice = 0;

		if (itemCod == 1) {
			totalPrice = cachorroQuente * itemQuant;
			System.out.printf("Total R$ %.2f", totalPrice);
		} else if (itemCod == 2) {
			totalPrice = xSalada * itemQuant;
			System.out.printf("Total R$ %.2f", totalPrice);
		} else if (itemCod == 3) {
			totalPrice = xBacon * itemQuant;
			System.out.printf("Total R$ %.2f", totalPrice);
		} else if (itemCod == 4) {
			totalPrice = torradaSimples * itemQuant;
			System.out.printf("Total R$ %.2f", totalPrice);
		} else if (itemCod == 5) {
			totalPrice = refrigerante * itemQuant;
			System.out.printf("Total R$ %.2f", totalPrice);
		}
		*/
		
		
		/*
		//(6)Verificar intervalo de número digitado
		System.out.println("Digite um número flutuante para verificar seu intervalo");
		double numberInputed = sc.nextDouble();
		
		if(numberInputed >= 0 && numberInputed <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if(numberInputed >= 25 && numberInputed <= 50) {
			System.out.println("Intervalo [25,50]");
		} else if(numberInputed >= 50 && numberInputed <= 75) {
			System.out.println("Intervalo [50,75]");
		} else if(numberInputed >= 75 && numberInputed <= 100) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		*/
		
		
		//(7)Verificar coordenadas
		System.out.println("Digite dois valores com uma casa decimal (x e y)");
		double coordX = sc.nextDouble();
		double coordY = sc.nextDouble();
		
		if(coordX > 0 && coordY > 0) {
			System.out.println("Q1");
		} else if (coordX < 0 && coordY > 0) {
			System.out.println("Q2");
		} else if (coordX < 0 && coordY < 0) {
			System.out.println("Q3");
		} else if (coordX > 0 && coordY < 0) {
			System.out.println("Q4");
		} else if (coordX == 0 && coordY == 0) {
			System.out.println("Origem");
		}
		
		
		
		sc.close();
	}

}
