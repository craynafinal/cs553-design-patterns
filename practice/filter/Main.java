public class Main {
	public static void main(String[] args) {
		FilterIF filter = new SourceFilter();
		FilterIF colorFilter = new ColorFilter(filter);	
		FilterIF inflatedFilter = new InflatedFilter(colorFilter);

		System.out.println(inflatedFilter.pull());	
	}
}
