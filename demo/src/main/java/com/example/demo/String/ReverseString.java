package com.example.demo.String;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Swapnil";
		String reverse = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		System.out.println("ORIGINAL STRING :"+ s);
		System.out.println("REVERSED STRING :"+ reverse);
	}

}
	