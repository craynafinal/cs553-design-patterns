import java.util.*;

public class CacheManager {

	// needs interface inheritance to allow a client to use this object
	// this class is static because it is used in static method, get
	private static class Drawing implements DrawingIF {
		private String desc = null;

		private Drawing(String desc) {
			this.desc = desc;
		}

		public void render() {
			System.out.println(desc);
		}
	}

	private CacheManager() {
	}

	private static Hashtable<String, DrawingIF> cache = new Hashtable<>();

	public static DrawingIF get(String key) {
		DrawingIF result = cache.get(key);

		if (result == null) {
			System.out.println("creating object with key " + key);
			result = new Drawing(key);
			cache.put(key, result);
		}
		return result;
	}

	public static void main(String[] args) {
		DrawingIF d1 = CacheManager.get("key");
		DrawingIF d2 = CacheManager.get("key");
	}
}
