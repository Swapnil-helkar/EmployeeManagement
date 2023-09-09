package com.example.demo.String;

public class SortArrayStrings {

	public static void main(String[] args) {
		String names[] = { "Swapnil", "Nisha", "pooja", "Amit" };

	
		
		String temp;
		for (int i = 0; i <names.length-1; i++) {
			for (int j = i + 1; j < names.length; 	j++) {
				if (names[i].compareToIgnoreCase(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

for (String string : names) {
	System.out.println(string);
}
	
	}

}
