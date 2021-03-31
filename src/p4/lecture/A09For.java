package p4.lecture;

public class A09For {
	public static void main(String[] args) {
		System.out.println("실행문1");
		
		
		
		//실행 순서 : 
		// 1번 --> 2번 - treu-> 코드블록 --> 3번 --> 2번 [반복]
//					   - flase -> 종료
		for (int i = 0;i < 3;i++){
		System.out.println("반복할 코드들...");
	}
}
}
