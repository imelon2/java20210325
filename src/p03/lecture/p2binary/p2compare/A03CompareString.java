package p03.lecture.p2binary.p2compare;

public class A03CompareString {
	public static void main(String[] args) {
		// and &&, &
		// or ||, |
		// xor ^ (배타적 논리합)
		// not !
		
		// and &&, & (boolean)
		//양변이 모두 true일 때만 true, 나머지 모두 false
		
		
		int i = 3;
		System.out.println(true && (i++)>0);
		System.out.println(i);
		
		System.out.println(false && (i++) > 0);
		System.out.println(i);
		
		//양변이 false일때만 false, 나머지 모두 true
		
		System.out.println(true || false);
		System.out.println(false || false);
		
		// xor ^ (exclusive or)
		// 두 항의 값이 다를때만 true
		// 두 항의 값이 같으면 false
		
		System.out.println(true ^ true);
		System.out.println(false ^false);
		System.out.println(true ^ false);
	}
}
