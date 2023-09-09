package com.example.demo;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 10;
		printPrime(n);

	}

	private static void printPrime(int n) {
		int num = 2;
		int count = 0;

		while (count < n) {

			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + " ");
				count++;
			}
			num++;
		}

	}

}
