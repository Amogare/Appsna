package Assignment2;

public class Manager extends Employee {
	private double intensive;

	public Manager(int id, double salary, double intensive) {
		super(id, salary);
		this.intensive = intensive;
	}

	public double getIntensive() {
		return intensive;
	}

	public void setIntensive(double intensive) {
		this.intensive = intensive;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary() + intensive;
	}

	@Override
	public String toString() {
		return "Manager [intensive=" + intensive + "]";
	}
}
