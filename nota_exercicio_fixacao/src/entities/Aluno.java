package entities;

public class Aluno {

	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;

	public double someGrade() {
		return gradeOne + gradeTwo + gradeThree;
	}

	public double missingGrade() {
		if (someGrade() < 60.00) {
			return 60.00 - someGrade();
		} else {
			return 0.0;
		}

	}
}