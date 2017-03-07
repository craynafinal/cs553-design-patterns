public abstract class IVisitable {
	private double price;

	public IVisitable(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public abstract double accept(IVisitor visitor);
}
