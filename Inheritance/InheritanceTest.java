class Base {
	int a = 10, b = 20;

	void displayAB() {
		System.out.println("In Base Class: " + a + " | " + b);
	}
}

class Derived extends Base {
	int c = 30;

	void displayABC() {
		System.out.println("In Derived Class: " + a + " | " + b + " | " + c);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		// create a child class instance
		Derived obj = new Derived();
		System.out.println(obj.a + " | " + obj.b + " | " + obj.c);
		obj.displayAB();
		obj.displayABC();
	}
}
