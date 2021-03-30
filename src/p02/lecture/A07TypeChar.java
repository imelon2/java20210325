package p02.lecture;

public class A07TypeChar {
	public static void main(String[] args) {
		//char : 2byte(8bit) 문자 저장
		//javascript
		//var a = "a";
		//    a = "가";
		
		// java 문자열
		String s1 = "hello";
		s1 = "자바";
		
		//java 문자
		char charVar;
//		charVar = "a"; // 안됨
		charVar = 'a'; // char literal
		charVar = '눈';
		System.out.println(charVar);
		charVar = '\uB208';
		System.out.println(charVar);
		charVar = '\u10E6';
		System.out.println(charVar);
	}
}
