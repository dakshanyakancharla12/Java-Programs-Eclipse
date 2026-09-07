package CIET;

interface Animal {
	void sound();
}

class Dog implements Animal {
	public void sound() {
		System.out.println("Dog Barks... BOW BOW");
	}
}

public class interface_code {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}
}
