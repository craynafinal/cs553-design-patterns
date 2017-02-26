import java.util.*;

// should be a singleton
public class FlyweightFactory {
	private FlyweightFactory() {}

	// should be a static member
	private static Hashtable<String, FlyweightIF> table = new Hashtable<>();

	// private inner class that won't be created by users
	// but outer class can access this

	// this class has to be static because it is used in the static method, get
	private static class Color implements FlyweightIF {
		private String color = null;
		private String code = null;
		
		private Color (String color, String code) {
			this.color = color;
			this.code = code;			
		}

		public void displayColor() {
			// this method is public because of the interface
			// so the whole inner class is private to avoid creation
			// but this method should be used by others so that is why this is public
			System.out.println(color + " " + code);
		}
	}

	// this supposed to be a static method
	public static FlyweightIF get(String name, String code) {
		String key = name + " " + code;
		FlyweightIF value = table.get(key);
		
		if (value == null) {
			System.out.println("creating " + key);
			value = new Color(name, code);
			table.put(key, value);
		} else {
			System.out.println(key + " already exists");
		}
		return value;
	}		
}
