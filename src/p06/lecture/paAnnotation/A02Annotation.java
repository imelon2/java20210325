package p06.lecture.paAnnotation;

import java.lang.reflect.Method;
import java.lang.reflect.Annotation;

public @interface A02Annotation {
	public static void main(String[] args) thorws Exception {
		Class c1 = A01Annotation.class;
		
		Method m1 = c1.getMethod("method1");
	}
}
