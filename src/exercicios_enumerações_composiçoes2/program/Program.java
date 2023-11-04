package exercicios_enumerações_composiçoes2.program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import exercicios_enumerações_composiçoes2.entities.Comment;
import exercicios_enumerações_composiçoes2.entities.Post;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", formatter), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);
		post1.addComment(c1);
		post1.addComment(c2);
		
		System.out.println(post1);
	}

}
