package p10.lecture;

public class A15Throw {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("프로그램 실행");
		method1();
		System.out.println("프로그램 종료");
	}

	public static void method1() throws ClassNotFoundException {
		method2();
	}

	public static void method2() throws ClassNotFoundException {
		method3();
	}

	public static void method3() throws ClassNotFoundException {
		method4();
	}

	public static void method4() throws ClassNotFoundException{
//		try {
//			Class.forName("java.lang.Number2");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		Class.forName("java.lang.Number2)");
	}

}
