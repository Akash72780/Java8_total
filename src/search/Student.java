package search;

public class Student implements Comparable<Student>{
	private String name;
	private int roll;
	private int marks;
	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString() {
		return String.format("(%s,%d,%d)", name,roll,marks);
	}
	@Override
	public int compareTo(Student o) {
		if(roll<o.getRoll())
			return -1;
		else if(roll>o.getRoll())
			return 1;
		else
			return 0;
	}

}
