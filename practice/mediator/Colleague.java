public class Colleague extends ComponentIF {
	public void onEvent(Event event) {
		for (EventListener el : eventList) {
			el.onEvent(event);			
		}
	}
}
