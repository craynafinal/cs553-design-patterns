public class Originator {
	private String data = null;

	public Originator(String data) {
		setData(data);
	}

	public void setData(String data) {
		this.data = data;
	}

	public Memento save() {
		return new Memento(data);
	}

	public void load(Memento memento) {
		this.data = memento.getData();
	}

	public String toString() {
		return data;
	}
}
