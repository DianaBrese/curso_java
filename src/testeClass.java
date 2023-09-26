
public class testeClass {

	public static void main(String[] args) {

	}
	

	public void solution(int number) {

		int sum = 0;

		for (int x = 0; x < 10; x++) {
			if (number % 3 == 0 || number % 5 == 0) {
				sum = sum + number;
				System.out.println(x);
			}
		}
	}
	
	

}


