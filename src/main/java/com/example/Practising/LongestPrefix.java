package com.example.Practising;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// PRINT THE LONGEST PREFIX (APPLE,APPU,APE----AP)
public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s =Arrays.asList("aysha","ayman","aylon");
		Collections.sort(s);
		System.out.println(s);
		String v=""; 
//		List<Character> c =new ArrayList<>();
		for(int i=0;i<s.size()-1;i++) {
			String s1=s.get(s.size()-1);
			String s2 = s.get(i);
			if(s1.charAt(i)==s2.charAt(i)) {
			v+=s1.charAt(i);	
			}
		}
		System.out.println(v);
//		String first = s.get(0);
//	    for (int i = 0; i < first.length(); i++) {
//	        char c = first.charAt(i);
//	        for (String a : s) {
//	            if (i >= a.length() || a.charAt(i) != c) {
//	               System.out.println( first.substring(0, i));
//	               return;
//	            }
//	        }
//	    }
		}
	}


	