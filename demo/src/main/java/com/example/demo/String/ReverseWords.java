package com.example.demo.String;

public class ReverseWords {

	public static void main(String[] args) {

		String s = "My name is Swapnil !";

		String[] s1 = s.split(" ");
		
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.println(s1[i]);
 
			 
		}
	}

}
