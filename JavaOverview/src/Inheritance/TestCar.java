package Inheritance;

public class TestCar {
//static polymorphism: at the time of compilation compilar decide which method need to call
	public static void main(String[] args) {
		BmwCar b = new BmwCar();
		b.start();
		b.stop();
		b.theFtSafety();
		b.reful();

		Car c = new Car();
		c.start();
		c.stop();
		c.reful();
	

	}

}
