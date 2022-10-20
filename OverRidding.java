
class Dog {
	public void bark() {
		System.out.println("woof ");
	}
}

class Hound extends Dog {
	public void sniff() {
		System.out.println("sniff ");
	}

	@Override
	public void bark() {
		System.out.println("bowl");
	}
}

public class OverRidding {

	public static void main(String[] args) {
		Dog dog = new Hound();// parent class reference creating Child class object. refer to child class
								// method
		dog.bark();
		Hound h = (Hound) new Dog();
		h.bark();

	}
}
