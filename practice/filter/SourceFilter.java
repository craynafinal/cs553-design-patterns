public class SourceFilter extends FilterIF {
	public SourceFilter() {
		super(null);
	}

	public Balloon pull() {
		return new Balloon();
	}
}
