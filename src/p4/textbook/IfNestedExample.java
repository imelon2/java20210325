package p4.textbook;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int) (Math.random()*20)+81; //81이상 100이하
		System.out.println("점수:"+score);
		
		String grade;
		if (score >= 90) {
			//a
			if (score >=95) {
				grade = "A";
			}else {
				grade ="B";
			}
		} else {
			//b
			if (score >=85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println(grade);
	}
}
