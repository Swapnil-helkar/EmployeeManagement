package com.example.demo;

public class MinMaxFinder {
	public static void main(String[] args) {
		int[] inputArray = { 5, 8, 98, -1, 7, 43, -73, 21, 92, 20 };
		int min = inputArray[0];
		int max = inputArray[0];

		for (int i = 1; i < inputArray.length; i++) {

			if (inputArray[i] < min) {

				min = inputArray[i];

			}
			if (inputArray[i] > max) {
				max = inputArray[i];
			}
		}
		System.out.println("Minimum element " + min);
		System.out.println("Maximum element " + max);
	}

}

/*
 * Write a code to find out the minimum and maximum elements from an array of 10
 * random integer values without sorting it and without using any predefind API
 * / method available in java.
 * 
 * Note : 1) Use of a length property of an array is allowed to traverse an
 * array. 2) Array may contain negative values too.
 * 
 * Sample Input array : int[] inputArray = {5, 8, 98, -1, 7, 43, -73, 21, 92,
 * 20}
 */