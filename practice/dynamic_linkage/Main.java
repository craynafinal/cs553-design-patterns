public class Main {
	public static void main(String[] args) {
		AbstractToolFactory pencilFactory = AbstractToolFactory.getFactory("PencilToolFactory");
		pencilFactory.getTool().print();

		AbstractToolFactory penFactory = AbstractToolFactory.getFactory("PenToolFactory");
		penFactory.getTool().print();

		AbstractToolFactory nullFactory = AbstractToolFactory.getFactory("random");
		System.out.println(nullFactory == null ? "It is null factory" : "It is not null factory");	
	}
}
