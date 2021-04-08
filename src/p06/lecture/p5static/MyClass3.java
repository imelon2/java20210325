package p06.lecture.p5static;

public class MyClass3 {
	static void method1() {
		System.out.println("method1()");
		method3();
	}
	
	
	static void method3() {
		System.out.println("method3()");
	}
	
	void method2() {
		System.out.println("method()2");
		method3();
	}
}
