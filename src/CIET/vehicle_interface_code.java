package CIET;

interface Vehicle {
	void start();
	void stop();
}

class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car starts with a Key!");
	}
	@Override
	public void stop() {
		System.out.println("Car stops using Brakes...");
	}
}

class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("Bike starts with self start!");
	}
	@Override
	public void stop() {
		System.out.println("Bike stops using Brakes...");
	}
}

class Bus implements Vehicle {
	@Override
	public void start() {
		System.out.println("Bus Starts with an Engine!");
	}
	@Override
	public void stop() {
		System.out.println("Bus stops using the Brakes...");
	}
}

public class vehicle_interface_code {
	public static void main(String[] args) {
		Vehicle a;
		a = new Car();
		a.start();
		a.stop();
		a = new Bike();
		a.start();
		a.stop();
		a = new Bus();
		a.start();
		a.stop();
	}
}
