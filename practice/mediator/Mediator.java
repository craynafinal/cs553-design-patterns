public class Mediator implements EventListener {
	public void onEvent(Event event) {
		if (event instanceof OnClick)  {
			System.out.println("onclick event");
		}
	}
}
