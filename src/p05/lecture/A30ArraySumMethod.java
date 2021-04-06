package p05.lecture;

import java.util.Arrays;

public class A30ArraySumMethod {
	public static void main(String[] args) {
		int[] arr1 = {8,7,6,5,4};
		int[] arr2 = {99,88,77,66,55,44};
		
		int[] arr3 = sum(arr1, arr2);
		System.out.println("arr3:" + Arrays.toString(arr3));
	}
	
	public static int[] sum(int[] a, int[] b) {
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[] c = new int[a.length];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}
		System.out.println(Arrays.toString(c));
		
		return c;
	}
}
