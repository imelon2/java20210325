package p4.textbook;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		
		for (i = 1 ; i <= 100; i++) {
			sum+=1;
		}
		System.out.println("1~" + (i-1)+ "합 : "+ sum );
	}
}
