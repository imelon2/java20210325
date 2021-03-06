package p02.lecture;

public class A09TypeDouble {
	public static void main(String[] args) {
		// double : 9byte (64bit) 실수 저장
		
		double v = 3.14; // 실수 literal은 double
		
		// 양의 최댓값
		System.out.println(Double.MAX_VALUE);
		
		// 양의 최소값
		System.out.println(Double.MIN_VALUE);
		// 음의 최소값
		System.out.println(-Double.MAX_VALUE);
		// 음의 최대값
		System.out.println(-Double.MIN_VALUE);
	}
}
