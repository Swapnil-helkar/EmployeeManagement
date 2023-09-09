package com.example.demo;

import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {
	public static void main(String[] args) {
		String str = "Hello";
		Map<Character, Long> charOccurrences = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(charOccurrences);

	}

}
