package p05.lecture;

public class A24ArrayOf {
	public static void main(String[] args) {
		int[][] arr2 = new int[2][3];
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j =0; j <arr2[i].length; i++) {
				System.out.println(arr2[i][j] + "," );
			}
			
			System.out.println();
		
		}
		arr2[1][1] =9 ;
	}
}
