package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
	
	static int a =30;
	static int b;
	
	static {
		b = 50;
		System.out.println("짠짠짠1");
	}
	
	
	MyClass4() {
		this.j = 5;
	}
}
