public abstract class FilterIF {
	private FilterIF prevFilter = null;

	public FilterIF(FilterIF prevFilter) {
		this.prevFilter = prevFilter;
	}

	protected FilterIF getPrevFilter() {
		return prevFilter;
	}

	abstract public Balloon pull();
}
