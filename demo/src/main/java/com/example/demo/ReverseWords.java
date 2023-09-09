package com.example.demo;

public class ReverseWords {
	public static void main(String[] args) {
		String input = " My Name is ABC";
		System.out.println(reverseWords(input));
		
		
		
		
	}
	public static String reverseWords(String input) {
		 String[] in=input.split(" ");
			String op="";
			for(int i=in.length-1;i>=0;i--) {
				op+= in[i]+" ";
			}
			
		return op;
		}
		
	}
