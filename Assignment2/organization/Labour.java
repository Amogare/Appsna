package Assignment2.organization;

public class Labour extends Employee {
	private double overTime;

	public Labour(int id, double salary, double overTime) {
		super(id, salary);
		this.overTime = overTime;
	}

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary() + overTime;
	}

	@Override
	public String toString() {
		return "Labour [overTime=" + overTime + "]";
	}
}
