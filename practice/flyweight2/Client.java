public class Client {
	public static void main(String[] args) {
		FlyweightIF black = FlyweightFactory.get("Black", "#000000");
		FlyweightIF white = FlyweightFactory.get("White", "#FFFFFF");
		FlyweightIF white2 = FlyweightFactory.get("White", "#FFFFFF");
	}
}
