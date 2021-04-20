package p08.textbook.s080503;

import p08.textbook.s080502.Kumhotire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new Kumhotire();
		myCar.tires[1] = new Kumhotire();
		
		myCar.run();
	}
}
