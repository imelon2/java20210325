package p07.lecture.p4access_modifier_protected.package1;

public class Parent {
	public void publicMethod() {
		System.out.println("piblic method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	void defaulMethod() {
		System.out.println("defaultTmethod");
	}
	
	private void privateMethod() {
		System.out.println("private method");
	}
}
