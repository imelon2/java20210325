package my;

import java.util.Scanner;

public class WorkoutMemo {
	public static void main(String[] args) {
		System.out.println("어디 운동 했습니까?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇세트 했습니까?");
		Scanner scanner1 = new Scanner(System.in);
		String part = scanner.next();
		Workoutclass workoutClass = new Workoutclass();
		workoutClass.backSet = scanner1();
	}
}
