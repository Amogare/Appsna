package Assignment2.dessert;

public abstract class DessertItem {
	private double tax;

	public DessertItem(double tax) {
		this.tax = tax;
	}

	public abstract double getCost();

	public double getTotalCost() {
		return getCost() + (getCost() * tax);
	}
}
