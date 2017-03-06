public class Main {
	public static void main (String[] args) {
		Originator o = new Originator("data1");
		System.out.println("first: " + o);

		Caretaker c = new Caretaker();
		int save1 = c.addMemento(o.save());
		o.setData("data2");
		System.out.println("second: " + o);
		
		int save2 = c.addMemento(o.save());
		o.setData("data3");
		System.out.println("last: " + o);

		o.load(c.getMemento(save1));
		System.out.println("restored data1: " + o);

		o.load(c.getMemento(save2));
		System.out.println("restored data2: " + o);
	}
}
