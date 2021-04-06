package p05.lecture;

import java.util.Arrays;

public class A21ArrayCopyAPI {
	public static void main(String[] args) {
		// system.arraycopy(p1, p2, p3, p4, p5);

		int[] arr1 = { 9, 7, 5, 3, 1 };
		int[] arr2 = new int[10];

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		// 복사
		System.arraycopy(arr1, 0, arr2, 0, 5);

		// 복사 후
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
