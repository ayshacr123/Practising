package com.example.Practising;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<List<String>,Integer> map=new HashMap<>();
List<String> list=Arrays.asList("Aysha","Ameena","haritha","anuja");
map.put(list, 5);
	

	for(Map.Entry<List<String>,Integer> entry: map.entrySet()) {
	        System.out.println(entry.getKey()+" "+entry.getValue());
	    
	}
}
}
