package p10.lecture;

public class A07ClassNotFoundException {
	public static void main(String[] args) {
		try {
		Class.forName("p10.lecture.A07ClassNoyFoundException");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		}
}
