public class TaxVisitor implements IVisitor {
	public double execute(Tabacco t) {
		return t.getPrice() * 1.2;
	}

	public double execute(Alcohol a) {
		return a.getPrice() * 1.4;
	}
}
