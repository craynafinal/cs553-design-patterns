import java.util.*;

public class StockGrabber implements Subject {
	private List<Observer> observers = new ArrayList<>();

	private int max = -1;
	private int min = -1;

	public void register(Observer observer) {
		observers.add(observer);
	}

	public void unregister(Observer observer) {
		//observers.remove(observers.indexOf(observer));
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(max, min);
			System.out.println(o);
		}
	}	

	public void setMax(int max) {
		this.max = max;
		notifyObservers();
	}

	public void setMin(int min) {
		this.min = min;
		notifyObservers();
	}
}
