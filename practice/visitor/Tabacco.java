public class Tabacco extends IVisitable {
	public Tabacco(double price) {
		super(price);
	}

	public double accept(IVisitor visitor) {
		return visitor.execute(this);
	}
}
