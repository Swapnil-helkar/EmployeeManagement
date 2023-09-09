package com.example.demo;

import java.util.Iterator;

public class FuzzBuzz {
	public static void main(String[] args) {

		double startTime=System.currentTimeMillis();
		 int n=100;
		 for(int i=1;i<=100;i++) {
			 if(i%15==0) {
				 System.out.println("FizzBuzz");
			 }
			 else if(i%5==0) {
				 System.out.println("Buzz");
			 }else if(i%3==0) {
				 System.out.println("Fizz");
			 }
			 else
				System.out.println(i); 
		 }
		 System.out.println("\n\ntotal time :"+(System.currentTimeMillis()-startTime)+"\n\n");
		 
//		 =========== 
			double startTime1=System.currentTimeMillis();

		 String s="";
		 int c3=0, c5=0;
		for(int i=1;i<=100;i++) {
			c3++;
			c5++;
			if(c3==3) {
				s+="Fizz";
				c3=0;
			}
			if(c5==5) {
				s+="Buzz";
				c5=0;
			} if (s.length() == 0) {
				System.out.println(i);
			}
            else
            {
            	System.out.println(s);
            }
           
			s = "";
		}
		 System.out.println("total time :"+(System.currentTimeMillis()-startTime1));

	}
}


















