package p04.textbook.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("---------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------");
			System.out.println("선택>");
			int choose = scanner.nextInt();
			
			switch (choose) {
			case 1:
				System.out.println("예금액>");
				int input = scanner.nextInt();
				balance += input;
				break;

			case 2:
				System.out.println("출금액>");
				scanner.nextInt();
				break;
				
			case 3:
				System.out.println("잔고>" + balance
						);
				break;
			case 4:
				run = false;
				break;
			
				
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
