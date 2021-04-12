package p07.lecture.p4access_modifier_protected.package1;

public class NotChild {
	public void notChildMethod() {
		Parent p = new Parent();
		p.publicMethod();
		p.protectedMethod();
		p.defaulMethod();
//		p.privateMethod();
	}
}
