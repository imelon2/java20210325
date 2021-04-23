package p11.lecture.classClass;

import java.lang.reflect.Field;

public class classClass {
	public static void main(String[] args) throws Exception {
		MyClass o1 = new MyClass();
		
		Class c1 = Class.forName("p11.lecture.classClass.MyClass");
		
		System.out.println(c1.getName());
		Field[] fields = c1.getDeclaredFields();
	}
}

class MyClass {
	private int field1;
	private int field2;

	MyClass() {

	}

	MyClass(int param1) {

	}

	public void methid1() {

	}
	public void method2() {
		
	}
}
