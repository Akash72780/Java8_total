package orm;

public class Student {
	
	public String name;
	public int marks;
	public String grade;
	public Student(String name, int marks, String grade) {
		super();
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return String.format("(%s,%d,%s)", name,marks,grade);
	}
	
}
