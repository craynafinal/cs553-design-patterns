public class Alcohol extends IVisitable {
	public Alcohol(double price) {
		super(price);
	}

	public double accept(IVisitor visitor) {
		return visitor.execute(this);
	}
}
