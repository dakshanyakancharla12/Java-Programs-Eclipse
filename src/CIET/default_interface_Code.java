package CIET;
interface Pet {
	void sound();
	default void stop() {
		System.out.println("Animals stops when it human comes infront of them...");
	}
}

class Cat implements Pet {
	public void sound() {
		System.out.println("Cat Says... MEOW MEOW");
	}
}

public class default_interface_Code {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		c.stop();
	}
}
