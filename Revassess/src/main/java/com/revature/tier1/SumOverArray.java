package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		if (arr==null) {
			return 0;
		}

		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOverArray check = new SumOverArray();

		int [] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] arr3 = { -1, -2, -3, -4, -5, -6, -7, -8, -9 };
		int[] arr4 = { 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 };
		int[] arr1 = null;

		System.out.println(check.IterateAndSum(arr1));
		System.out.println(check.IterateAndSum(arr2));
		System.out.println(check.IterateAndSum(arr3));
		System.out.println(check.IterateAndSum(arr4));
	}

}
