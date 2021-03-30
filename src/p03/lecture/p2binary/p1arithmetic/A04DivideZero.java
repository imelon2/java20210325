package p03.lecture.p2binary.p1arithmetic;

public class A04DivideZero {
	public static void main(String[] args) {
//		int a = 3;
//		int b = 0;
		
//		int c = a / b;  정수는 0으로 나눌 순 없음
		
		// 신수는 0으로 나누면 무한대
		double x = 3.0;
		double y = 0.0;
		double z = x / y;
		System.out.println(z);
		double w = z - 3.14;
		System.out.println(w);
		
		//실수의 0으로 나눈 나머지는 NaN(Not a Number)
		
		double e = 5.0;
		double f = 0.0;
		double g = e % f;
		System.out.println(g);
	}
}
