package p06.lecture.p2field;

public class A02Field {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "소나타";
		car1.model = "하이브리드";
		
		Car car2 = new Car();
		car2.name = "tesla";
		car2.model = "model3";
		
		System.out.println(car1.name);
		System.out.println(car1.model);
	}
}
