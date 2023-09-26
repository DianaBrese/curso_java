package exercicios_introducao_orientacao_objetos;

public class Student {
	public String name;
	public double firstQuarter;
	public double secondQuarter;
	public double thirdQuarter;

	public double finalGrade() {
		return firstQuarter + secondQuarter + thirdQuarter;
	}

	public String hasStudentPassed() {
		if (finalGrade() >= 60) {
			return "PASS";
		} else {
			double missingPoints = 60 - finalGrade();
			return "FAILED" + System.lineSeparator() +  "MISSING " + missingPoints + " POINTS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f",finalGrade()) + System.lineSeparator() + hasStudentPassed();
	}
}
