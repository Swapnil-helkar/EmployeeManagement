package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class FindString {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Rajat", "RajatBawane", " Akshay","arargahajajja");
		strings.stream().filter(str -> str.length() > 10).forEach(System.out::println);
	}

}
