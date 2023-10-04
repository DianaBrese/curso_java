import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testeClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for(String forList: list) {
			System.out.println(forList);
		}
		
		
		
		sc.close();

	}

}
