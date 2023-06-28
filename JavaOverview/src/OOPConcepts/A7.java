package OOPConcepts;

public class A7 implements Printable, Showable {

	@Override
	public void show() {
		System.out.println("show");

	}

	@Override
	public void print() {

		System.out.println("print");
	}

	public static void main(String[] args) {

		A7 obj = new A7();
		obj.print();
		obj.show();

	}
}
