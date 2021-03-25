package p02.lecture;

public class A05TypeInt {
	public static void main(String[] args) {
		//int : 4byte(32bit)
		
		//십진법 0 = 0000 0000 0000 0000 0000 0000 0000 0000
		//십진법 1 = 0000 0000 0000 0000 0000 0000 0000 0001
		//십진법 2 = 0000 0000 0000 0000 0000 0000 0000 0010
		
		//십진법  = 0111 1111 1111 1111 1111 1111 1111 1111
		
		int intVar;
		intVar = 0;
		intVar = 2147483647;
//		intVar = 2147483648; //벗어남
		intVar = -2147483648;
//		intVar = -2147483649; // 벗어남
		
		intVar = 255;
		System.out.println(intVar);
		intVar = 0xff;
		System.out.println(intVar);
	}
}
