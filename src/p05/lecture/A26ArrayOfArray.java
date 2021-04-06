package p05.lecture;

public class A26ArrayOfArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		
		System.out.println("arr길이: " + arr.length);
		
		for (int[] a : arr) {
			System.out.println(a);
		}
		
		arr[0] = new int[3];
		arr[1] = new int[2];
	}
}
