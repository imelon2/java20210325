package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {
		// GCD : 최대공약수 : greatest common divisor 
		// 두 수의 약수중에 공통으로 큰 거
		//ex) 12, 18 == > 6
		//ex)  5, 10 == > 5
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int tmp, n;
		System.out.println("입력 받은 두 수는 " + num1 + "과" + num2);
		//for문으로 작성하기
		for ( int d = num1; d >=1; d--) {
			if((num1 %d)==0 && (num2 % d)==0) {
				System.out.println("최대공약수는: " + d);
				break;
				
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
//		//num1을 큰 값으로 만들기
//		if(num1<num2){
//			tmp = num1;
//			num1 = num2;
//			num2 = tmp;
//		}
//		
//		
//		    while(num2!=0){
//		        n = num1%num2;
//		        num1 = num2;
//		        num2 = n;
//		    }
//		  
//		    System.out.println(num1);
//		  
//	
//		    
//		scanner.close();
//	}
//}
