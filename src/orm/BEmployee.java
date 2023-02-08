package orm;

public class BEmployee {
	
	public String name;
	public int salary;
	public BEmployee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("(%s,%d)", name,salary);
	}
}
