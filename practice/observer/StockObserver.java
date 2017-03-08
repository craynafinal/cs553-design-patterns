public class StockObserver implements Observer {
	private int max = -1;
	private int min = -1;

	private static int observerID = -1;
	private int id = -1;

	/*
	private Subject stockGrabber = null;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;

		this.stockGrabber.register(this);
	}
	*/

	public StockObserver() {
		this.id = ++observerID;
	}

	public void update(int max, int min) {
		this.max = max;
		this.min = min;
		//System.out.println("max: " + this.max + "\nmin: " + this.min);
	}

	public String toString() {
		return "observer " + id + ": max " + max + " / min " + min;
	}
}
