package p06.lecture.p4method;

public class Myclass3 {
int a;

void method1() {
	System.out.println("a:" + this.a);
	System.out.println("method1 호출");
	
	method2();
}

void method2() {
	System.out.println("method2 호출");
}
}
