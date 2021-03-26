package p02.lecture;

public class A14TypeConversion {
	public static void main(String[] args) {
		int intVar1 = 33;
		int intVar2 = 44;
		
		int intVar3 = intVar1 + intVar2;
		
		long longVar1 = 55;
		
//		int intVar4 = intVar1 + longVar1;
		long longVar2 = intVar1 + longVar1;
		
		double doubleVar1 = 3.14;
//		int intVar5 = intVar1 + doubleVar1;
		double doubleVar2 = intVar1 + doubleVar1;
		
////////////////////////////////////////////		
		byte b1 = 3;
		byte b2 = 9;
//		byte b3 = b1 + b2;
		int res = b1 + b2;
		
		char c1 = 'a';
//		char c2 = c1 + 1;
		
		byte b4 = 3 + 1;
		char c3 = 'a' + 1;
		
		
		
	}
}
