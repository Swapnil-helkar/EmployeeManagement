package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDemo implements Comparable<ArrayDemo>{
public static void main(String[] args) {
	List<String> s=new ArrayList<>();
	s.add("XSwapnil");
	s.add("Rajat");
	s.add("Swapnil");
	s.add("Swapnil");
	
	List<String> distinct = s.stream().distinct().collect(Collectors.toList());
	System.out.println("Distinct value :"+ distinct);

Collections.sort(s);
System.out.println("Sorted LLsit :"+ s );


}

@Override
public int compareTo(ArrayDemo o) {
	
	return 0;
}

 

}
