package com.example.demo.String;

public class Add2StringNos {

	public static void main(String[] args) {
		String a="111";
		String b="222";
		
		int sum = Integer.parseInt(a)+ Integer.parseInt(b);;
		System.out.println(" SUM :"+sum);
		
//		String.ValueOf() -> gives string representation of int argument
		
		System.out.println(String.valueOf(sum));
	}

}
