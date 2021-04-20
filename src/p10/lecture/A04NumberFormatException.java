package p10.lecture;

public class A04NumberFormatException {
	public static void main(String[] args) {
		String str1 = "100";
		
		int int1 = Integer.parseInt(str1);
		
		int result = int1 * 2;
		System.out.println(result);
		System.out.println("프로그램 종료.");
	}
}
