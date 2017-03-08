public class Main {
	public static void main(String[] args) {
		StockGrabber sg = new StockGrabber();

		StockObserver so1 = new StockObserver();
		StockObserver so2 = new StockObserver();

		sg.register(so1);
		sg.register(so2);

		sg.setMax(100);
		sg.setMin(1);	
	}
}
