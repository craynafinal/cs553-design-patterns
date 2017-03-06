public class Client {
	public static void main(String[] args) {
		ComponentIF c1 = new Colleague();
		
		c1.addEventListener(new Mediator());
		c1.onEvent(new OnClick());	
	}
}
