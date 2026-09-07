package CIET;

interface Pets {
	void eat();
}

interface Lion {
	void roar();
}

class Turtle implements Pets, Lion {
	public void eat() {
		System.out.println("Animal eats");
	}
	public void roar() {
		System.out.println("Lion Roars");
	}
}

public class multiple_inheritance_interface {
	public static void main(String[] args) {
		Turtle c = new Turtle();
		c.eat();
		c.roar();
	}
}
