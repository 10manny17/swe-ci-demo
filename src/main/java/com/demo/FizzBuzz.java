package com.demo;

public class FizzBuzz {
	String processNumber(int num) {
		if (num < 0) {
			return "Invalid Input";
		}
		if (num % 3 == 0 && num % 5 != 0) {
			return "Fizz";
		}
		if (num % 5 == 0 && num % 3 != 0) {
			return "Buzz";
		}
		if (num % 15 == 0) {
			return "FizzBuzz";
		}
		return String.valueOf(num);
	}

	String processNumbers(int[] nums) {
		String s = "";
		if (nums.length == 0) {
			return "Invalid Input";
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 15 == 0) {
				if (i < nums.length - 1) {
					s += "FizzBuzz, ";
				}
				s += "FizzBuzz";
			} else if (nums[i] % 5 == 0) {
				if (i < nums.length - 1) {
					if (i < nums.length - 1) {
						s += "Buzz, ";
					}
					s += "Buzz,";
				} else if (nums[i] % 3 == 0) {
					if (i < nums.length - 1) {
						s += "Fizz, ";
					}
					s += "Fizz, ";
				} else {
					if (i < nums.length - 1) {
						s += String.valueOf(nums[i] + ", ");
					}
					s += String.valueOf(nums[i]);
				}
			}
		}
		return s;
	}
}
