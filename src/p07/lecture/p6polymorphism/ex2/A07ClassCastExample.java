package p07.lecture.p6polymorphism.ex2;

public class A07ClassCastExample {
	public static void main(String[] args) {
		KindaCat k1 = new Tiger();
		
		Tiger t1 = (Tiger) k1;
		
		System.out.println("프로그램 종료");
	}
}
