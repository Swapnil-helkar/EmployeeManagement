package com.example.demo.String;

public class EvenLengthWords {

	public static void main(String[] args) {

String s="Hell World Swapnil Hi";

for (String string : s.split(" ")) {
	if(string.length()%2==0) {
		System.out.println(string);
	}
}

	}

}
