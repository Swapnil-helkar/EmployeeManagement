package com.example.demo.String;

//Write a Java program to check whether a given string ends with the contents of another string.


public class CheckContentOfAnotherStringInEnd {
	
	boolean check(String s1, String s2) {
		if(s1.endsWith(s2)) {
			return true;
		}else
		return false;
		
	}
	
public static void main(String[] args) {
	
	String s1="Hello World";
	String s2="Hello Worldw";
	
	String end="ld";
	
	CheckContentOfAnotherStringInEnd c=new CheckContentOfAnotherStringInEnd();
	boolean check = c.check(s1, end);
	System.out.println();
	
	boolean endsWith = s1.endsWith(end);
	boolean endsWith2 = s2.endsWith(end);
	
	System.out.println("s1 ends with ld:"+ endsWith);
	System.out.println("s2 ends with ld:"+ endsWith2);
}
}
