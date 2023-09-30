package exercicios_vetores.entities;

public class People {
	private double height;
	private char genre;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}

	public People(double height, char genre) {

		this.height = height;
		this.genre = genre;
	}
}
