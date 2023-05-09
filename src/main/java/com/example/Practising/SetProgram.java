package com.example.Practising;

import java.util.HashSet;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="malayalam";
		int  count=0;
		Set<Character> s = new HashSet<>();
		for(int i=0;i<a.length();i++)
		{
			s.add(a.charAt(i));
		}
		
		System.out.println(s);
		

	}
	

}
