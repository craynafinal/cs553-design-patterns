public class ColorFilter extends FilterIF {
	public ColorFilter(FilterIF prevFilter) {
		super(prevFilter);
	}

	public Balloon pull() {
		Balloon balloon = this.getPrevFilter().pull();
		balloon.setColor("Red");
		return balloon;
	}
}
