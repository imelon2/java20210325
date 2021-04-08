package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass5 {
	void method1() {
		System.out.println("method1 ~~");
	}
	
	void method2(int a) {
		System.out.println("method2!!");
	}
	void method3(int a, int b) {
		System.out.println("method3###");
	}
	
	void method4(int[] a) {
		System.out.println("method4$$$");
		System.out.println(Arrays.toString(a));
		a[0] = 999;
	}
}
