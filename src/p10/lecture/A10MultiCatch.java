package p10.lecture;

public class A10MultiCatch {
	public static void main(String[] args) {
		
		try {
		String[] arr1 = {"300","abc"};
		int i = Integer.parseInt(arr1[2]);
		} catch (NumberFormatException e) {
			System.out.println("숫자형식이 바르지 않습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 잘 못참조.");
		}
		System.out.println("시스템 종료");
	}
}
