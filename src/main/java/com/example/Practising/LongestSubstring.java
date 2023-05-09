package com.example.Practising;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="pwwekewi";
		List<Character> l =new ArrayList<>();
		int count=0,max=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				if(!l.contains(s.charAt(j))) {
					l.add(s.charAt(j));
					count++;
					max=Math.max(max,count);
				}
				else {
					count=0;
					l.clear();
					break;
				}
			}
		}
//		l.forEach(e -> System.out.println(e));
		System.out.println(max);
	}

}






