package p02.textbook;

public class FormIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456789;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
