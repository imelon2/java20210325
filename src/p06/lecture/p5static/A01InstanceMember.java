package p06.lecture.p5static;

public class A01InstanceMember {
	public static void main(String[] args) {
		Myclass1 o1 = new Myclass1();
		o1.i = 3;
		o1.method();
		
		Myclass1 o2 = new Myclass1();
		o2.i=5;
		o2.method();
		
		
	}
}
