import java.util.*;

public abstract class ComponentIF {
	protected List<EventListener> eventList = new ArrayList<>();

	public void addEventListener(EventListener el) {
		eventList.add(el);
	}

	public abstract void onEvent(Event event);
}
