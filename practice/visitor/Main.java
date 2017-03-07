public class Main {
	public static void main(String[] args) {
		TaxVisitor tv = new TaxVisitor();

		Tabacco t = new Tabacco(5.0);
		Alcohol a = new Alcohol(10.0);

		System.out.println("tabacco\noriginal price: " + t.getPrice() + "\ntax price: " + t.accept(tv));
		System.out.println("alcohol\noriginal price: " + a.getPrice() + "\ntax price: " + a.accept(tv));
	}
}
