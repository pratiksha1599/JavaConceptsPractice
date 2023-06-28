package Polymorphism;

public class Ex_MethodOverloading {

	// we cannot create method inside method
	// same method name with different data type or different argument or differernt
	// parameters are allowed in java

	public static void main(String[] args) {
		Ex_MethodOverloading obj = new Ex_MethodOverloading();
		obj.sum();
		obj.sum(12);
		obj.sum(12, 2);

	}

	public void sum() {

		System.out.println("sum method--Zero parameter");
	}

	public void sum(int a) {
		System.out.println("sum method with 1 parameter" + a);
	}

	public void sum(int a, float d) {
		System.out.println("sum method with 2 parametr:");

		System.out.println(a + d);
	}

}
