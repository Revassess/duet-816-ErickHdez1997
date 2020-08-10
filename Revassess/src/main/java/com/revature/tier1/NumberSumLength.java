package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String s1 = Long.toString(num);
		int[] intArray = new int[s1.length()+1];
		SumOverArray sumDigits = new SumOverArray();
		int sumPowers = 0;

		for (int i=0; i<s1.length(); i++) {
			sumPowers = sumPowers + s1.length();
		}

		for (int i=0; i<s1.length(); i++) {
			intArray[i] = Integer.parseInt(Character.toString(s1.charAt(i)));
		}
		if (sumPowers==sumDigits.IterateAndSum(intArray))
			return true;
		else
			return false;
	}
}
