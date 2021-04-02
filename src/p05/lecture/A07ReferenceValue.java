package p05.lecture;

public class A07ReferenceValue {
public static void main(String[] args) {
	String s = new String("java");
	String t = "java";
	String u = "java";
	
	int a = System.identityHashCode(s);
	System.out.println(a);
}
}
