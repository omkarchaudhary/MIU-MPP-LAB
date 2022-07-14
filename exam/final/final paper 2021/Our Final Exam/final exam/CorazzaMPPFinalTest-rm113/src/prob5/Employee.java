package prob5;

public class Employee implements Comparable<Employee> {
	private String name;
	private int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	
	@Override 
	public String toString() {
		return "(" + name + ":" + salary + ")";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary - o.salary;
	}
	
	
}

