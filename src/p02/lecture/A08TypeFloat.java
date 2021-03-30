package p02.lecture;

public class A08TypeFloat {
	public static void main(String[] args) {
		// float: 4byte (32bit) 실수 저장
		
		long longar = 220000000000L;
		
		float var;
		var = 3.14F; // 실수 literal은 double타입(8byte) 
		             // var 은 8 byte이기 때문에 literal 에 + F 해줌
		
		// 최대값
		System.out.println(Float.MAX_VALUE);
		
		// 최소값
		System.out.println(Float.MIN_VALUE);
	}
}
