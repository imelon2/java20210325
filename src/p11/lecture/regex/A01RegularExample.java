package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExample {
	public static void main(String[] args) {
		String regex1 = "a";
		String str1 ="a";
		
		
		
		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);
		
		regex1 = "java";
		str1 ="java";
		
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "9";
		str1 ="0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3}";
		str1 = "999";
		
		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-9162-8235";
		
		regex1 = "\\d{3,5}";
		str1 = "2222";
		
		regex1 = "\\d+"; // = \d{1,}
		str1 ="1";
	}
}
