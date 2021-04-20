package p10.lecture;

import java.io.FileInputStream;

public class A17ThrowPolymorphism {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method1() throws Exception {
		Class.forName("java.lang.string");
		FileInputStream file = new FileInputStream("");
	}
}
