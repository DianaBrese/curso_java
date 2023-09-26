package exercicios_estruturas_sequenciais;
import java.util.Scanner;

public class Exercicio_Estruturas_Sequenciais {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//(1)Somar números inteiros
		System.out.println("Digite dois números inteiros para realizar a soma.");
		int addNumber1, addNumber2, resultAdd;
		addNumber1 = sc.nextInt();
		addNumber2 = sc.nextInt();
		resultAdd = addNumber1 + addNumber2;
		System.out.println("SOMA: " + resultAdd);
		
		
		
		//(2)Calcular raio de um círculo
		System.out.println("Digite aqui o tamanho do círculo para calcular seu raio");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double resultRaio = pi * Math.pow(raio, 2);
		System.out.printf("O raio do círculo é: %.4f%n", resultRaio);
		
		
		
		//(3)Calcular diferença entre 4 produtos
		System.out.println("Digite quatro valores inteiros para calcular a diferença dos produtos A e B pelos produtos C e D");
		int productA, productB, productC, productD, difference;
		productA = sc.nextInt();
		productB = sc.nextInt();
		productC = sc.nextInt();
		productD = sc.nextInt();
		difference = ((productA * productB) - (productC * productD));
		System.out.println("A diferença dos produtos é de: " + difference);
		
		
		
		//(4)Calcular salário
	
		System.out.println("Digite aqui o número do funcionário, suas horas trabalhadas e o valor que recebe por hora para calcular seu salário");
		int workerNumber = sc.nextInt();
		double hoursWorked = sc.nextDouble();
		double valueHour = sc.nextDouble();
		double salary = hoursWorked * valueHour;
		System.out.printf("Número do funcionário: %d%nSalário:U$ %.2f%n ", workerNumber, salary);
		
		
		
		//(5) Calcular valor das peças de roupas
		System.out.println("Digite aqui o código, quantidade e valor unitário das peças 1");
		int codItem1 = sc.nextInt();
		int quantItem1 = sc.nextInt();
		double valueItem1 = sc.nextDouble();
		
		System.out.println("Digite aqui o código, quantidade e valor unitário das peças 2");
		int codItem2 = sc.nextInt();
		int quantItem2 = sc.nextInt();
		double valueItem2 = sc.nextDouble();
		
		double valueToPay = ((quantItem1 * valueItem1) + (quantItem2 * valueItem2));
		System.out.printf("Foi adquirido os produtos de códigos %d e %d e o valor total a pagar é de R$ %.2f%n", codItem1, codItem2, valueToPay);
		
		
		//(6)Calcular Geometria
		System.out.println("Digite aqui 3 números em ponto flutuante:");
		double floatA = sc.nextDouble();
		double floatB = sc.nextDouble();
		double floatC = sc.nextDouble();
		
		double triangulo = (floatA * floatC) / 2;
		double circulo = 3.14159 * Math.pow(floatC, 2);
		double trapezio = ((floatA + floatB) * floatC) / 2;
		double quadrado = Math.pow(floatB, 2);
		double retangulo = floatA * floatB;
		
		System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		sc.close();
	}

}
