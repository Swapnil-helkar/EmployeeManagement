package com.example.demo.String;

public class Compare2Strings {

	public static void main(String[] args) {

		String s = "swapnil";
		String s1 = "dwapnil";
boolean b=false;
		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i)!=s1.charAt(i)) {
				b=false;
				break;
			}
			else
				b=true;
			
		}
		System.out.println("is SAME ? " +b);
	}
}
