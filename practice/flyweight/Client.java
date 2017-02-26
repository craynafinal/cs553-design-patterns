public class Client {
	public static void main(String[] args) {
		FlyweightIF g1 = FlyweightFactory.get('a', 10); // create
		FlyweightIF g2 = FlyweightFactory.get('a', 20); // create
		FlyweightIF g3 = FlyweightFactory.get('a', 20); // won't create		
	}
}
