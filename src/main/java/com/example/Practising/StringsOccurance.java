package com.example.Practising;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringsOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		HashMap<Character,Integer> map=new HashMap();
		int count=0;
//		for(int i=0;i<s.length();i++) {
				
//			for(int j=0;j<s.length();j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//					 count = count+1;
//				}
//			}
//			map.put(s.charAt(i), count);
			for(int i=0;i<s.length();i++) {
				
				
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//			if(count==1) {
//				System.out.println(s.charAt(i));
//			}
//		
//			count=0;
		}
			for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			    if(entry.getValue()==1) {
			        System.out.println(entry.getKey()+" "+entry.getValue());
			    }
			}
	}



//	List<String> s = Arrays.asList("kochi","kochi","ekm","kochi","ekm","ekm","kollam");
//	HashMap<String,Integer> map=new HashMap();
//	int count=0;
//	for(String a: s) {
//		String b=a;
//		for(String c:s) {
//		if(a.equals(c)) {
//			count++;
//		}
//		}
//		
//	   
//	map.put(a, count);
//		count=0;
//	}
//	for(Map.Entry<String,Integer> entry: map.entrySet()) {
//		System.out.println(entry.getKey()+" = "+entry.getValue());
//	}
}
