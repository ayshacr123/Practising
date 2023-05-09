package com.example.Practising;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReapaetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("car","dog","car");
	
		
		int count=0;
		Map<String,Integer> map=new HashMap<>();
		for(String a:l) {
			for(String b:l) {
				if(a.equals(b)) {
					count++;
				}
			}
			map.put(a, count);
			count=0;
		}
//		for(Map.Entry<String, Integer> entry: map.entrySet()) {
//			System.out.println(entry.getKey()+"-"+entry.getValue());
//		}
		Map<String,Integer> co=new HashMap<>();
		for(String a:l) {
			co.put(a, l.indexOf(a));
		}
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			for(Map.Entry<String, Integer> entry1: co.entrySet()) {		
			if(entry.getValue()>1) {
				System.out.println(entry1.getKey()+"-"+entry1.getValue());
				break;
			}
			}
		}
		
	}

}
