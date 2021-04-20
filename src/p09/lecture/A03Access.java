package p09.lecture;

public class A03Access {
	class NonStaticClass{
		
	}
	
	static class StaticClass {
		
	}
	
	NonStaticClass o1 = new NonStaticClass();
	StaticClass o2 = new StaticClass();
	
	static StaticClass o3 = new StaticClass();
//	static NonStaticClass o4 = new NonStaticClass);
	
	
	void instanceMethod() {
		staticMethod();
	}
	
	static void staticMethod() {
		
	}
}
