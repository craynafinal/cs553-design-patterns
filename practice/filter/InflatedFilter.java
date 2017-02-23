public class InflatedFilter extends FilterIF {
  public InflatedFilter(FilterIF prevFilter) {
    super(prevFilter);
  }

  public Balloon pull() {
    Balloon balloon = this.getPrevFilter().pull();
    balloon.setInflated(true);
    return balloon;
  }
}

