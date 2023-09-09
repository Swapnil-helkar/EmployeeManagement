package com.example.demo.String;

public class CountWords {

	public static void main(String[] args) {

		String s = "Hii Hello my name is XXX";
		countWords(s);
	}

	private static void countWords(String s) {

		int count = 0;
		if (s.charAt(0) != ' ') {
			count++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Coutnt :"+count);
	}

}
